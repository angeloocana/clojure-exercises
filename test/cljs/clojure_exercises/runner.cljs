(ns clojure-exercises.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [clojure-exercises.core-test]
              [clojure-exercises.fizzbuzz-test]))

(doo-tests 'clojure-exercises.core-test
           'clojure-exercises.fizzbuzz-test)
