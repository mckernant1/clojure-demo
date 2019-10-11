(in-ns 'clojure-demo.core)

; Clojure Functions
(println "Functions")

(defn example
  "I say hello to you!"
  [& x]
  (println "Hello," (clojure.string/join " " x)))

(def exampleShort
  "This is an anonymous function that says hello!"
  (fn [& x] (println "Hello,"
                     (clojure.string/join " " x))))

(def exampleShorter
  "This is another anonymous function that says hello!"
  #(println "Hello," (clojure.string/join " " %&)))


; Parameter deconstructing

(defn destruct
  "This function deconstructs parameters"
  [[x y & z]] (str x " and " y " and " z)
  )

; Partial Function application
(def partialExample
  (partial example "There")
  )
(partialExample "Tom")
