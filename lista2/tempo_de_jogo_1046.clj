(ns clojur.lista2.tempo-de-jogo-1046)

(def hora_inicial (read))
(def hora_final (read))

(defn calcular_duracao [hora_inicial hora_final]
  (cond
    (< hora_inicial hora_final) (- hora_final hora_inicial)
    :else
    (- (+ 24 hora_final) hora_inicial)
    )
  )

(println "O JOGO DUROU" (calcular_duracao hora_inicial hora_final)  "HORA(S)"  )