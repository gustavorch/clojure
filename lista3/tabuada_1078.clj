(ns clojur.lista3.tabuada-1078)

(def x (read))
(def valores (range 1 11))

(defn func [n]
  (println (str n " x " x " = "(* n x))))

(dorun (map func valores))