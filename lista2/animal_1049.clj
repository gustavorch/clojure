(ns clojur.lista2.animal-1049)

(def a (str (read)))
(def b (str (read)))
(def c (str (read)))

(defn func [a b c]
  (cond
    (and (= a "vertebrado") (= b "ave") (= c "carnivoro")) (println "aguia")
    (and (= a "vertebrado") (= b "ave") (= c "onivoro")) (println "pomba")
    (and (= a "vertebrado") (= b "mamifero") (= c "onivoro")) (println "homem")
    (and (= a "vertebrado") (= b "mamifero") (= c "herbivoro")) (println "vaca")
    (and (= a "invertebrado") (= b "inseto") (= c "hematofago")) (println "pulga")
    (and (= a "invertebrado") (= b "inseto") (= c "herbivoro")) (println "lagarta")
    (and (= a "invertebrado") (= b "anelideo") (= c "hematofago")) (println "sanguessuga")
    (and (= a "invertebrado") (= b "anelideo") (= c "onivoro")) (println "minhoca")
    )
  )

(func a b c)