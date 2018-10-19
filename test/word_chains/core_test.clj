(ns word-chains.core-test
  (:require [clojure.test :refer :all]
            [word-chains.core :refer :all]))

(deftest a-test
  (testing "Test word chains."
    (is (= true (word-chain #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})))
    (is (= false (word-chain #{"cot" "hot" "bat" "fat"})))
    (is (= false (word-chain #{"to" "top" "stop" "tops" "toss"})))
    (is (= true (word-chain #{"spout" "do" "pot" "pout" "spot" "dot"})))
    (is (= true (word-chain #{"share" "hares" "shares" "hare" "are"})))
    (is (= false (word-chain #{"share" "hares" "hare" "are"})))
    ))
