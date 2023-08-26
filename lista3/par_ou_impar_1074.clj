(ns clojur.lista3.par-ou-impar-1074)

(def n (read))
(def valores (repeatedly n (fn [] (read))))

(defn func [x]
  (cond
    (and (odd? x) (neg? x)) "ODD NEGATIVE"
    (and (odd? x) (pos? x)) "ODD POSITIVE"
    (and (even? x) (neg? x)) "EVEN NEGATIVE"
    (and (even? x) (pos? x)) "EVEN POSITIVE"
    (zero? x) "NULL"))

(dorun (map #(println (func %)) valores))