(ns clj-sicp.exercise-1.7)

(defn good-enough?
  [guess avg]
  (> (* (/ (min guess avg) (max guess avg)) 100) 99.99999))
  
(defn square-root
  "Finds the sqaure root of the specified number by Newton's method"
  [n]
  (loop [guess 1]
    (let [quotient (double (/ n guess))
          avg (double (/ (+ quotient guess) 2))]
      (if (good-enough? guess avg)
        avg
        (recur avg)))))

