(ns clojur.lista3.numeros-pares-1059)

(def numeros (range 1 101))
(run! println (filter even? numeros))