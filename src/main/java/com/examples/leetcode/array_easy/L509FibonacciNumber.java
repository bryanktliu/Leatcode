package com.examples.leetcode.array_easy;

/** https://www.google.com/url?q=https://leetcode.com/problems/fibonacci-number */
public class L509FibonacciNumber {

    private int[] map;

    public int fib(int n) {
        if (map == null) {
            map = new int[n + 1];
        }
        if (n < 2) {
            return n;
        }
        if (map[n - 1] == 0) {
            map[n - 1] = fib(n - 1);
        }
        if (map[n - 2] == 0) {
            map[n - 2] = fib(n - 2);
        }
        map[n] = map[n - 1] + map[n - 2];
        return map[n];
    }
}
