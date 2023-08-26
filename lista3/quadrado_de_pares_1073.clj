(ns clojur.lista3.quadrado-de-pares-1073)

(def n (read))
(def valores (range 1 (+ n 1)))

(defn func [n]
  (cond
    (even? n) (println (str n "^2 = " (* n n)))))

(dorun (map func valores))