(ns clojur.lista3.resto-da-divisao-1133)

(def x (read))
(def y (read))

(def valores (range (+ x 1) y))
(def valores2 (range (+ y 1) x))

(defn fnc [n]
  (cond (or (= 2(mod n 5)) (= 3(mod n 5))) (println n)))

(if (< x y)
  (dorun (map fnc valores))
  (dorun (map fnc valores2))
  )