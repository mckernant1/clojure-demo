(in-ns 'clojure-demo.core)

(println "Lazy")

(defn fib-seq
  ([] (fib-seq 0 1))
  ([a b]
   (lazy-seq
     (cons b (fib-seq b (+ a b)))
     ))
  )

; An example of taking from an infinite cycle
(take 10 (cycle (range 5)))
