(ns my-project-mandelbrot.app
  (:require [my-project-mandelbrot.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
