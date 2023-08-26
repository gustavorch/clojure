(ns clojur.lista2.teste-de-selecao-1035)

(def a (read)) (def b (read))
(def c (read)) (def d (read))

(defn calcula [a b c d]
  (if (and (> b c)
           (> d a)
           (> (+ c d) (+ a b))
           (pos? c)
           (pos? d)
           (even? a))
    (println "Valores aceitos")
    (println "Valores nao aceitos")))

(calcula a b c d)