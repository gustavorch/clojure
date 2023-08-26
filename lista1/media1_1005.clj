(ns clojur.lista1.media1-1005)

(def a (read))
(def b (read))
(def MEDIA (/ (+ (* a 3.5) (* b 7.5)) 11))
(println "MEDIA =" (format "%.5f" MEDIA))
