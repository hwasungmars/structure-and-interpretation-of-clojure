(ns sic.counting-change-test
  (:require [clojure.test :refer :all]
            [sic.counting-change :refer :all]))

(deftest count-change-test
  (testing "Base cases."
    (is (= 1 (count-change 0.01)))
    (is (= 2 (count-change 0.05)))
    (is (= 4 (count-change 0.10)))))
