
(defn prime? [n]
  (loop [i 2 num n]
    (if (>= i num)
      true
      (if (= (mod num i) 0)
        false
        (recur (inc i) num)))))


