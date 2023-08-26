(ns clojur.lista3.resto2-1075)

(def x (read))

(defn func [n]
  (cond (= 2 (mod n x)) (println n)))

(def valores (range 1 10000))

(dorun (map func valores))