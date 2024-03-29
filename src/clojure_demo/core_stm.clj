(in-ns 'clojure-demo.core)

(println "STM")

; This creates a reference
(def myAtom (atom "Atom String"))
(def myRef (ref "Ref String"))


; These are two ways to dereference a value
(deref myAtom)
@myAtom
@myRef

; Altering an Atom
(swap! myAtom str " Reference")

; Changing references with transactions
(dosync (alter myRef str "Reference"))
(dosync (ref-set myRef "Reference"))
