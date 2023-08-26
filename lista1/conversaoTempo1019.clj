(ns clojur.lista1.conversaoTempo1019)

(def tempo (read))
(defn converter [tempo]
  (let [horas (quot tempo 3600) minutos (quot (mod tempo 3600) 60) segundos (mod tempo 60)]
    (str horas ":" (str minutos) ":" (str segundos))))

(println (converter tempo))