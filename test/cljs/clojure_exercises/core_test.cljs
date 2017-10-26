(ns clojure-exercises.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [clojure-exercises.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
