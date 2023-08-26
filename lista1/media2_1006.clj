(ns clojur.lista1.media2-1006)

(def a (read))
(def b (read))
(def c (read))

(def MEDIA (/ (+ (* a 2.0) (* b 3.0) (* c 5.0)) 10.0))

(println "MEDIA ="(format "%.1f" MEDIA))
