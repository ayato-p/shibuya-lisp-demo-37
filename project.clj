(defproject demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 ;; Hotload Dependency: <prefix> hd
                 ;; [hiccup "1.0.5"]
                 ]
  :source-paths ["src" "src-cljs" "src-cljc"]
  :profiles
  ;; for ClojureScript REPL
  {:dev {:dependencies [[com.cemerick/piggieback "0.2.1"]]
         :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}})
