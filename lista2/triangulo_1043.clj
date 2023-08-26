(ns clojur.lista2.triangulo-1043)

(def a (read))
(def b (read))
(def c (read))

(defn ehTriangulo? [a b c]
  (and (< a (+ b c))
       (< b (+ a c))
       (< c (+ a b))))

(defn area_trapezio [a b c]
  (/ (* (+ a b) c) 2))


(defn func [a b c]
  (cond
    (ehTriangulo? a b c) (println "Perimetro =" (+ a b c))
    :else
    (println "Area =" (area_trapezio a b c))
    )
  )

(func a b c)