(ns my-project-mandelbrot.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [my-project-mandelbrot.core-test]))

(doo-tests 'my-project-mandelbrot.core-test)

