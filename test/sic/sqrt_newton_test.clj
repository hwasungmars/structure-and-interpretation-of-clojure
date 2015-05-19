(ns sic.sqrt-newton-test
  (:require [clojure.test :refer :all]
            [sic.sqrt-newton :refer :all]))

(deftest sqrt-test
  (testing "Square root of 4 should be 2."
    (is (= 2.0 (sqrt 4)))))
