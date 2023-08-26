(ns clojur.lista1.idadeEmDias1020)

(def idade (read))

(defn converter [idade]
  (def anos (quot idade 365))
  (def meses (quot (mod idade 365) 30))
  (def dias (mod (mod idade 365) 30))
  (println anos "ano(s)") (println meses "mes(es)") (println dias "dia(s)")
  )

(converter idade)