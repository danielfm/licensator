(ns licensator.config)

;; Media URL prefix
(def ^:dynamic *media-prefix* "/media/")

;; Prefix for the most used kinds of resources
(def ^:dynamic *img-prefix* (str *media-prefix* "img/"))
(def ^:dynamic *css-prefix* (str *media-prefix* "css/"))
(def ^:dynamic *js-prefix* (str *media-prefix* "js/"))

;; Other config
(def ^:dynamic *author-url* "http://danielfm.me")
(def ^:dynamic *author-name* "Daniel Fernandes Martins")
(def ^:dynamic *author-email* "daniel.tritone@gmail.com")

(def ^:dynamic *google-analytics-key* "UA-761701-8")
