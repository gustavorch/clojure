(ns clojur.lista2.sort-simples-1042)

(def a (read))
(def b (read))
(def c (read))

(def valores [a b c])
(def valores_ordenados (sort valores))

(println (nth valores_ordenados 0))
(println (nth valores_ordenados 1))
(println (nth valores_ordenados 2))
(println)
(println a)
(println b)
(println c)