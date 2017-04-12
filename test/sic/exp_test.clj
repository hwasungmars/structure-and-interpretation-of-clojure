(ns sic.exp-test
  (:require [sic.exp :refer :all]
            [clojure.test :refer :all]))

(deftest iterative-test
  (testing "Iterative gives correct answers."
    (is (= 1 (iterative 2 0)))
    (is (= 1024 (iterative 2 10))))
  (testing "Iterative should not blow the stack"
    (is (= 1048576 (iterative 2 20)))))
