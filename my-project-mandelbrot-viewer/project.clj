(defproject my-project-mandelbrot-viewer "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.11.4"]
                 [org.clojure/core.async "1.5.648"]]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-figwheel "0.5.20"]]

  :repl-options {:init-ns my-project-mandelbrot-viewer.core})
