(defproject licensator "0.1-SNAPSHOT"
  :description "A small webapp that helps you choose the right license for your open source projects."
  :url "http://github.com/danielfm/licensator"
  :aot [licensator.local
        licensator.production]
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "0.5.0"]
                 [ring "1.1.6"]
                 [hiccup "1.0.1"]]
  :main licensator.core)
