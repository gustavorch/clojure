(ns clojur.lista3.dividindo-x-por-y-1116)

(def n (read))
(def valores (repeatedly n (fn [] (vector (read) (read)))))

(defn func [x y]
  (cond (zero? y) "divisao impossivel"
        :else (float (/ x y))))

(dorun (map #(println (func (first %) (second %))) valores))