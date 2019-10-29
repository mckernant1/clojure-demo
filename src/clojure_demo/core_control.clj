(in-ns 'clojure-demo.core)

; If Statement
(if (= 1 1) "True" "False")

; Cond block
(cond
  (even? 1) "Result 1"
  :else 1
  )
