(ns sic.counting-change)

(defn- count-change-in-p
  "Recursive implementation that does the work."
  [amount-in-pennies coins]
  (cond (< amount-in-pennies 0) 0
        (= amount-in-pennies 0) 1
        (empty? coins) 0
        :else (+ (count-change-in-p (- amount-in-pennies (first coins)) coins)
                 (count-change-in-p amount-in-pennies (rest coins)))))

(defn count-change
  "Given amount of pounds (GBP) who many ways can we express it with coins?

  British coins are of 50p, 20p, 10p, 5p, 1p values.
  "
  [amount]
  (count-change-in-p (int (* 100 amount)) [50 20 10 5 1]))

