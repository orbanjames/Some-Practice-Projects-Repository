(ns my-project-mandelbrot.core)

(defn mount-components []
  (let [content (js/document.getElementById "app")]
    (while (.hasChildNodes content)
      (.removeChild content (.-lastChild content)))
    (.appendChild content (js/document.createTextNode "Welcome to my-project-mandelbrot"))))

(defn init! []
  (mount-components))
