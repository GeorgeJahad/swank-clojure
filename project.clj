(defproject org.clojars.gjahad/swank-clojure "1.3.1.1-SNAPSHOT"
  :description "Swank server connecting Clojure to Emacs SLIME"
  :url "http://github.com/technomancy/swank-clojure"
  :dependencies  [[org.clojure/clojure "1.2.0"] [cdt "1.2.6.1-SNAPSHOT"]]
  :dev-dependencies [[lein-multi "1.0.0"]]
  :multi-deps {"1.1" [[org.clojure/clojure "1.1.0"]
                      [org.clojure/clojure-contrib "1.1.0"]]
               "1.3" [[org.clojure/clojure "1.3.0-master-SNAPSHOT"]]}
  :shell-wrapper {:main swank.swank})
