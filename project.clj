(defproject licensator "0.1-SNAPSHOT"
  :description "A small webapp that helps you choose the right license for your open source projects."
  :url "http://github.com/danielfm/licensator"
  :namespaces [licensator.local
	       licensator.production]
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
		 [compojure "0.4.1"]
		 [ring "0.2.5"]
		 [ring/ring-jetty-adapter "0.2.5"]
		 [ring/ring-servlet "0.2.5"]
		 [hiccup "0.2.6"]]
  :dev-dependencies [[swank-clojure "1.3.0-SNAPSHOT"]
		     [lein-run "1.0.0-SNAPSHOT"]]
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib"
  :run-aliases {:server [licensator.local -main]})
