(in-ns 'clojure-demo.core)

(println "Lazy")

(defn fibonacci
  ([] (fibonacci 0 1))
  ([prev2 prev1]
   (lazy-seq
     (cons prev1 (fibonacci prev1 (+ prev2 prev1)))
     ))
  )

; An example of taking from an infinite cycle
(take 10 (cycle (range 5)))
