(ns clojur.lista3.numeros-impares-1067)

(def x (read))
(def numeros (range 1 (+ x 1)))

(run! println (filter odd? numeros))