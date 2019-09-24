(in-ns 'clojure-demo.core)

; Clojure Macros
(println "Macros")

; Thread first macro

; These two macros are equivalent
(->
  (range 10)
  (concat '(1))
  )

(as->
  (range 10) input
  (concat input '(1))
  )

; These two macros are equivalent
(->>
  (range 10)
  (concat '(1))
  )

(as->
  (range 10) input
  (concat '(1) input)
  )
