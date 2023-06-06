package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sum-multiples/ */
public class L2652SumMultiples {

    public int sumOfMultiples(int n) {
        boolean[] multiples = new boolean[n + 1];
        int total = 0;
        for (int i = 0; i <= n; i += 3) {
            multiples[i] = true;
            total += i;
        }
        for (int i = 0; i <= n; i += 5) {
            if (!multiples[i]) {
                multiples[i] = true;
                total += i;
            }
        }
        for (int i = 0; i <= n; i += 7) {
            if (!multiples[i]) {
                multiples[i] = true;
                total += i;
            }
        }
        return total;
    }
}
