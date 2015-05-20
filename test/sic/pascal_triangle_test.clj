(ns sic.pascal-triangle-test
  (:require [sic.pascal-triangle :refer :all]
            [clojure.test :refer :all]))

(deftest combi-test
  (testing "Pascal triangle combination computation."
    (is (= 1 (combi 0 0)))
    (is (= 1 (combi 2 2)))
    (is (= 10 (combi 5 2)))))

