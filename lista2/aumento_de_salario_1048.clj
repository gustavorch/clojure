(ns clojur.lista2.aumento-de-salario-1048)

(def salario (read))

(defn reajuste [salario]
  (cond
    (and (>= salario 0.0) (<= salario 400.00)) 0.15
    (and (> salario 400.00) (<= salario 800.00)) 0.12
    (and (> salario 800.00) (<= salario 1200.00)) 0.10
    (and (> salario 1200.00) (<= salario 2000.00)) 0.07
    (> salario 2000.00) 0.04
    )
  )

(println "Novo salario:"  (format "%.2f" (+ salario (* salario (reajuste salario)))))
(println "Reajuste ganho:"  (format "%.2f" (* salario (reajuste salario))))
(println "Em percentual:" (format "%.0f" (* (reajuste salario) 100)) "%")