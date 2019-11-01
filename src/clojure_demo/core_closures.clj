(in-ns 'clojure-demo.core)

(println "Closures")

(defn counter
  []
  (let [a (atom 0)]
    (fn [] (do
             (swap! a inc)
             @a)
      )
    ))

(def ct1 (counter))
(def ct2 (counter))

