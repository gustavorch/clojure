(ns clojur.lista3.seis-numeros-impares-1070)

(def x (read))

(def numeros (range x (* x 50)))

(println (nth (filter odd? numeros) 0) )
(println (nth (filter odd? numeros) 1) )
(println (nth (filter odd? numeros) 2) )
(println (nth (filter odd? numeros) 3) )
(println (nth (filter odd? numeros) 4) )
(println (nth (filter odd? numeros) 5) )