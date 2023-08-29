(def n (read))

(defn func [x y]
  (cond (zero? y) "divisao impossivel"
        :else (float (/ x y))))

(dorun (map (fn [x] "insira a função aqui") (range n)))

(dorun (map (fn [x] (println (func (read) (read)))) (range n)))



;Lendo um único valor por linha

;(def n (read))
;(def valores (repeatedly n (fn [] (read))))
;
;(defn func [x]
;  (cond
;    (and (odd? x) (neg? x)) "ODD NEGATIVE"
;    (and (odd? x) (pos? x)) "ODD POSITIVE"
;    (and (even? x) (neg? x)) "EVEN NEGATIVE"
;    (and (even? x) (pos? x)) "EVEN POSITIVE"
;    (zero? x) "NULL"))
;
;(dorun (map #(println (func %)) valores))



;Lendo múltiplos valores por linha

;(def n (read))
;(def valores (repeatedly n (fn [] (vector (read) (read)))))
;
;(defn func [x y]
;  (cond
;    (= x y) "iguais"
;    :else "diferentes"))
;
;(dorun (map #(println (func (first %) (second %))) valores))





