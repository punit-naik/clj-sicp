(ns clj-sicp.exercise-1.5)

(defn p [] (p))

(defn test [x y] (if (zero? x) x y))

; Explanation: This call will result in a stack overflow exception as the function call to `test` will first try to resolve the inner function call to `p`
;
(test 0 (p))

