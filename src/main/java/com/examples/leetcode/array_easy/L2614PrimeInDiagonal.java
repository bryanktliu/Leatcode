package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/prime-in-diagonal/ */
public class L2614PrimeInDiagonal {

    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][i] > max && isPrime(nums[i][i])) {
                max = nums[i][i];
            }
            if (isPrime(nums[i][nums.length - 1 - i])) {
                max = nums[i][nums.length - 1 - i];
            }
        }
        if (max == 1) {
            return 0;
        }
        return max;
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
