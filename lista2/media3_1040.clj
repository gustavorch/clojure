(ns clojur.lista2.media3-1040)

(def n1 (read)) (def n2 (read)) (def n3 (read)) (def n4 (read))

(def media (/ (+ (* n1 2) (* n2 3) (* n3 4) (* n4 1)) 10))

(println "Media:" (format "%.1f"  (/ (Math/floor (* media 10)) 10.0)))

(def nova_media (atom -1))

(defn func [nota_exame]
  (println "Aluno em exame.")
  (println "Nota do exame:" nota_exame)
  (let [nova_media_val (/(+ nota_exame media)2)] (reset! nova_media nova_media_val)))


(cond
  (>= media 7.0) (println "Aluno aprovado.")
  (< media 5.0) (println "Aluno reprovado.")
  :else
  (func (read))  ;caso a nota seja entre 5 e 7
  )

(cond
  (>= @nova_media 5.0) (do (println "Aluno aprovado.") (println "Media final:" @nova_media))
  (and (< @nova_media 5.0) (> @nova_media 0)) (println "Aluno reprovado.")
  )

