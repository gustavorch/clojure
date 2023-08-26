(ns clojur.lista2.bhaskara-1036)

(def a (read))
(def b (read))
(def c (read))

(def delta (- (* b b) (* 4 a c)))

(defn bhaskara [a b c]
  (cond
    (or (neg? delta) (zero? a)) (println "Impossivel calcular")
    :else
    (let [r1 (/ (+ (- b) (Math/sqrt delta)) (* 2 a))
          r2 (/ (- (- b) (Math/sqrt delta)) (* 2 a))]
      (println (str "R1 = " (format "%.5f" r1)))
      (println (str "R2 = " (format "%.5f" r2))))
    )
  )

(bhaskara a b c)