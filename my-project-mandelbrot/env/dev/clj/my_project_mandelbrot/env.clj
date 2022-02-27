(ns my-project-mandelbrot.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [my-project-mandelbrot.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[my-project-mandelbrot started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[my-project-mandelbrot has shut down successfully]=-"))
   :middleware wrap-dev})
