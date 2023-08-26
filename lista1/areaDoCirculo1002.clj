(ns clojur.lista1.areaDoCirculo1002)

(def pi 3.14159)
(def raio (read))
(def r (* raio raio))

(def area (* pi r))

(println (str "A="(format "%.4f" area)))
