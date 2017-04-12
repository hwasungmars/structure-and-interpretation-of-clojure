(ns sic.exp)

(set! *warn-on-reflection* true)

(defn iterative
  "An interative computation of exp."
  [x n]
  (loop [acc 1
         squares x
         m n]
    (if (= m 0)
      acc
      (recur (long (* acc (if (odd? m) squares 1)))
             (* squares squares)
             (quot m 2)))))
