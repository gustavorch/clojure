(ns clojur.lista1.salarioBonus1009)

(def nome (read))
(def salario (read))
(def dinheiroDasVendas (read))

(def total (+ salario (* 0.15 dinheiroDasVendas)))

(println "TOTAL = R$" (format "%.2f" total))