(ns clj-sicp.exercise-1.3)

(defn sum-of-squares
 "Takes in 3 numbers as arguments and returns the sum of squares of the two largest numbers"
 [a b c]
 (->> (sort [a b c])
      rest
      (map #(Math/pow % 2))
      (reduce +)))

