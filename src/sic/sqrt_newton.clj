(ns sic.sqrt-newton
  (:require [clojure.math.numeric-tower :as math]))

(defn average
  [x y]
  (float (/ (+ x y) 2)))

(defn improve
  [guess x]
  (average guess (float (/ x guess))))

(defn good-enough?
  [guess x]
  (< (math/abs (- (* guess guess) x))
     0.001))

(defn sqrt-iter
  [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))

(defn sqrt
  [x]
  (sqrt-iter (float (/ x 2)) x))

