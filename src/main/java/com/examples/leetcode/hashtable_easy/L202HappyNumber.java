package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/happy-number/ */
public class L202HappyNumber {

    public boolean isHappy(int n) {
        while (true) {
            if (n < 10) {
                return n == 1 || n == 7;
            }
            n = sumSquareDigits(n);
        }
    }

    public int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 9) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum + n * n;
    }
}
