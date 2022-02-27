(ns my-project-mandelbrot.core-test
  (:require [cljs.test :refer-macros [is are deftest testing use-fixtures]]
            [pjstadig.humane-test-output]
            [my-project-mandelbrot.core :as rc]))

(deftest test-home
  (is (= true true)))

