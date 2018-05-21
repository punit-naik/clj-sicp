(ns clj-sicp.exercise-1.4)

(defmacro absolute-sum
 "Takes in 2 numbers as arguments and returns the absolute sum of both the numbers"
 [a b]
 (list (if (> b 0) '+ '-) a b))

