(ns clojur.lista1.cedulas1018)

(def entrada (read))
(defn converter [entrada]
  (let [notas_de_100 (quot entrada 100)
        notas_de_50 (quot (mod entrada 100) 50)
        notas_de_20 (quot (mod (mod entrada 100) 50) 20)
        notas_de_10 (quot (mod (mod (mod entrada 100) 50) 20) 10)
        notas_de_5  (quot (mod (mod (mod (mod entrada 100) 50) 20) 10) 5)
        notas_de_2  (quot (mod (mod (mod (mod (mod entrada 100) 50) 20) 10) 5) 2)
        notas_de_1  (quot (mod (mod (mod (mod (mod (mod entrada 100) 50) 20) 10) 5) 2) 1)]

    (println entrada)
    (println notas_de_100 "nota(s) de R$ 100,00")
    (println notas_de_50 "nota(s) de R$ 50,00")
    (println notas_de_20 "nota(s) de R$ 20,00")
    (println notas_de_10 "nota(s) de R$ 10,00")
    (println notas_de_5 "nota(s) de R$ 5,00")
    (println notas_de_2 "nota(s) de R$ 2,00")
    (println notas_de_1 "nota(s) de R$ 1,00")
    )
  )

(converter entrada)