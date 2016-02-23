(ns demo.core-test
  (:require [clojure.test :refer :all]
            [demo.core :refer :all]))

(deftest plus3-test
  (testing "positive number"
    (are [n expect] (= (plus3 n) expect)
      1  2
      10 13
      11 14))
  (testing "negative number"
    (are [n expect] (= (plus3 n) expect)
      -1  2
      -10 -7
      -11 -8)))
