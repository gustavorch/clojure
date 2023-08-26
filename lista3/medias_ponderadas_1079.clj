(ns clojur.lista3.medias-ponderadas-1079)

(def n (read))

(defn calcular_media [v1 v2 v3]
  (format "%.1f" (/ (+ (* v1 2) (* v2 3) (* v3 5)) 10)))

(def valores (vec (repeatedly n (fn [] (vector (read) (read) (read))))))
(dorun (map (fn [[v1 v2 v3]] (println (calcular_media v1 v2 v3))) valores))