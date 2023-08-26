(ns clojur.lista1.salario1008)

(def number (read))
(def horasTrabalhadas (read))
(def valorPorHora (read))

(def salario (* horasTrabalhadas valorPorHora))

(println "NUMBER =" number)
(println "SALARY = U$" (format "%.2f" salario))