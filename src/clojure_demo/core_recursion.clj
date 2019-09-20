(in-ns 'clojure-demo.core)

(defn powRecursive
  "A recursive pow function"
  [x y]
  (letfn [(powAcc
            [counter acc]
            (cond
              (= counter 0) acc
              :else (powAcc (- counter 1) (* acc x))))]
    (powAcc y 1)))

(defn powTailRecursive
  "A tail recursive pow function"
  [x y]
  (loop
    [counter y
     acc 1]
    (cond
      (= counter 0) acc
      :else (recur (- counter 1) (* acc x)))
    ))

(defn toPow
  "Creates a pow function for a particular power"
  [x]
  #(powTailRecursive %1 x))

(def square "A square function" (toPow 2))
