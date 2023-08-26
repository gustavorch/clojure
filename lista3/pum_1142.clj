(ns clojur.lista3.pum-1142)

(def n (read))

(def alcance (range 1 (+ (* n 4) 1) 4))

(defn fnc [x]
  (println x (+ x 1) (+ x 2) "PUM"))

(dorun (map fnc alcance))