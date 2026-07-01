(ns articulated_scene-test
  (:require [clojure.test :refer [deftest is testing]]
            [articulated_scene]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? articulated_scene))))
