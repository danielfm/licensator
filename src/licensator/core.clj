(ns licensator.core
  (:use (compojure core)
        (ring.middleware file params)
        (ring.adapter jetty)
        (licensator.view index license about contact error-404)
        (licensator middleware))
  (:require [compojure.route :as route]))

(defroutes handler
  (GET "/" [] (index-view))
  (POST "/" {form :params} (suggest-view form))
  (GET "/licenses/:id/" [id] (license-info-view id))
  (GET "/licenses/" [] (licenses-view))
  (GET "/about/" [] (about-view))
  (GET "/contact/" [] (contact-view))
  (route/not-found (not-found-view)))

(def app
  (-> handler
      (wrap-append-slash)
      (wrap-params)
      (wrap-file "public")))

(defn start-server [port]
  (future (run-jetty #'app {:port port})))

(defn -main [& [port]]
  (if port
    (start-server (Integer/parseInt port))
    (start-server 8080)))