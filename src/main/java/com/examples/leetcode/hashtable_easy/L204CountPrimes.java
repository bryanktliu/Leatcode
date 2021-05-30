package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/count-primes/ */
public class L204CountPrimes {

    public int countPrimes(int n) {
        boolean[] map = new boolean[n];
        if (n < 3) {
            return 0;
        }
        int count = n / 2;
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (map[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += 2 * i) {
                if (!map[j]) {
                    --count;
                    map[j] = true;
                }
            }
        }
        return count;
    }
}
