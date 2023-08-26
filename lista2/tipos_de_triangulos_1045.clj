(ns clojur.lista2.tipos-de-triangulos-1045)

(def a (read))
(def b (read))
(def c (read))

(def lados [a b c])
(def ordenados (reverse(sort lados)))

(def a (nth ordenados 0))
(def b (nth ordenados 1))
(def c (nth ordenados 2))

(defn func [a b c]
  (cond
    (>= a (+ b c)) "NAO FORMA TRIANGULO"
    (= (* a a) (+ (* b b) (* c c))) "TRIANGULO RETANGULO"
    (> (* a a) (+ (* b b) (* c c))) "TRIANGULO OBTUSANGULO"
    (< (* a a) (+ (* b b) (* c c))) "TRIANGULO ACUTANGULO"

    )
  )


(println (func a b c))

(cond
  (or (and (= a b) (not= a c) (not= b c))
      (and (= b c) (not= b a) (not= c a))
      (and (= c a) (not= c b) (not= a b)))
  (println "TRIANGULO ISOSCELES")
  )

(cond
  (= a b c) (println "TRIANGULO EQUILATERO")
  )