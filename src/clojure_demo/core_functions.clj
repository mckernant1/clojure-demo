(in-ns 'clojure-demo.core)

(defn example
  "I say hello to you!"
  [& x]
  (println "Hello," (clojure.string/join " " x)))

(def exampleShort
  (fn [& x] (println "Hello,"
                     (clojure.string/join " " x))))

(def exampleShorter #(println "Hello," (clojure.string/join " " %&)))
