(ns clojur.lista2.coordenadas-1041)

(def x (read))
(def y (read))

(defn func [x y]
  (cond
    (and (zero? x) (zero? y)) (println "Origem")
    (and (> x 0) (> y 0)) (println "Q1")
    (and (< x 0) (> y 0)) (println "Q2")
    (and (< x 0) (< y 0)) (println "Q3")
    (and (> x 0) (< y 0)) (println "Q4")
    (zero? x) (println "Eixo Y")
    (zero? y) (println "Eixo X")
    )
  )

(func x y)