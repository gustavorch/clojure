(ns clojur.lista1.esfera1011)

(def raio (read))
(def pi 3.14159)
(def R (* raio raio raio))
(def volume (* (/ 4 3.0) pi R  ))

(println "VOLUME =" (format "%.3f" volume))