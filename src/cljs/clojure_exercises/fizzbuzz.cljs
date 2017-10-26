(ns clojure-exercises.fizzbuzz)

(defn divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn get-fizz-buzz-msg [n]  
  (cond
    (and (divisible-by? 3 n) (divisible-by? 5 n)) "FizzBuzz"
    (divisible-by? 3 n) "Fizz"
    (divisible-by? 5 n) "Buzz"
    :else n))

(defn get-fizz-buzz-list [n]
  "Write a function to print a list o n numbers,
  When the number is divisible by:
   3 return Fizz,
   5 return Buzz,
   3 & 5 return FizzBuzz,
   else return the number"
  (map get-fizz-buzz-msg (range 1 (+ 1 n))))
