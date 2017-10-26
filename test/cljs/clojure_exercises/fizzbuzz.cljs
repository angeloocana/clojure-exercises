(ns clojure-exercises.fizzbuzz-test
  (:require [cljs.test :refer-macros [deftest testing is]])
  (:use [clojure-exercises.fizzbuzz :only [divisible-by? get-fizz-buzz-msg get-fizz-buzz-list]]))

(deftest divisible-by-test
  (testing "Divisible by"
    (is (false? (divisible-by? 3 1)))
    (is (true? (divisible-by? 3 3)))
    (is (true? (divisible-by? 5 10)))
    (is (false? (divisible-by? 5 8)))))

(deftest get-fizz-buzz-msg-test
  (testing "Get fizz buzz msg"
      (is (= "Fizz" (get-fizz-buzz-msg 9)))
      (is (= "Buzz" (get-fizz-buzz-msg 25)))
      (is (= "FizzBuzz" (get-fizz-buzz-msg 15)))
      (is (= 1  ))))

(deftest get-fizz-buzz-list-test
  (testing "Get fizz buzz list"
    (let [list (get-fizz-buzz-list 15)
          expected-list [1
                         2
                         "Fizz"
                         4
                         "Buzz"
                         "Fizz"
                         7
                         8
                         "Fizz"
                         "Buzz"
                         11
                         "Fizz"
                         13
                         14
                         "FizzBuzz"]]
      (is (= list expected-list)))))

(println "Fizz Buzz Example:")
(println (get-fizz-buzz-list 100))