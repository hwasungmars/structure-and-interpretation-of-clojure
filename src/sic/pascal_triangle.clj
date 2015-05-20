(ns sic.pascal-triangle)

(defn combi
  "Compute the combination of the Pascal triangle m choose n."
  [m n]
  (cond (= n 0) 1
        (= m n) 1
        :else (+ (combi (- m 1) n)
           (combi (- m 1) (- n 1))
           )
        )
  )

