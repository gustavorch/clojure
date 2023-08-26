(ns clojur.lista2.tempo-de-jogo-com-minutos-1047)

(def hora_inicial (read)) (def minuto_inicial (read)) (def hora_final (read)) (def minuto_final (read))

(defn calculo [hora_inicial minuto_inicial hora_final minuto_final]
  (let [minutos_iniciais (+ (* hora_inicial 60) minuto_inicial)
        minutos_finais (+ (* hora_final 60) minuto_final)
        duracao_minutos (mod (+ (- minutos_finais minutos_iniciais) 1440) 1440)]
    (if (= duracao_minutos 0)
      "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)"
      (let [duracao_horas (int (/ duracao_minutos 60))
            duracao_minutos_remanescentes (- duracao_minutos (* duracao_horas 60))]
        (str "O JOGO DUROU " duracao_horas " HORA(S) E " duracao_minutos_remanescentes " MINUTO(S)")))))

(println (calculo hora_inicial minuto_inicial hora_final minuto_final))
