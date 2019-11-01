(in-ns 'clojure-demo.core)

(println "Macros")

(defmacro inc3
  [x]
  (list + 3 x)
  )
