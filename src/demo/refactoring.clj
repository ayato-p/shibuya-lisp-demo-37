(ns demo.refactoring
  (:require [clojure.walk :as clojure-walk]))
;;; Add Require: <prefix> ar demo.other
;;; Clean Namespace: <prefix> cn

;;; Magic Require: type str/

;;; Wrap in thread-last: <prefix> tl
;;; unwind: <prefix> uw / unwind-all: <prefix> ua
(filter even? (map inc (range 10)))

;;; Cycle Surrounding Collection Type: <prefix> cc
(def a (mapcat vector
               (->> (range (int \a) (inc (int \h)))
                    (map char)
                    (map (comp keyword str)))
               (range)))

;;; Add Stub: <prefix> as
(defprotocol LifeCycle
  (start [_])
  (stop [_]))

(defrecord Server [conf]
  ;; LifeCycle
  )

;;; Destructure keys: <prefix> dk
(let [m {:foo 1, :bar 2, :baz 4}]
  (+ (:foo m)
     (:bar m)
     (:baz m)))
