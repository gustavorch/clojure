(ns clojur.lista2.multiplos-1044)

(def a (read))
(def b (read))

(defn func [a b]
  (cond
    (or (= 0 (mod a b)) (= 0 (mod b a))) (println "Sao Multiplos")
    :else
    (println "Nao sao Multiplos")
    )
  )

(func a b)