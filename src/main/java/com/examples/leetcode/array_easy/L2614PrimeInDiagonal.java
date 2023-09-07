package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/prime-in-diagonal/ */
public class L2614PrimeInDiagonal {

    public int diagonalPrime(int[][] nums) {
        int max = 1;
        for (int[] num : nums) {
            for (int j = 0; j < nums.length; ++j) {
                if (num[j] % 2 != 0) {
                    max = Math.max(max, num[j]);
                }
                if (num[nums.length - 1 - j] % 2 != 0) {
                    max = Math.max(max, num[nums.length - 1 - j]);
                }
            }
        }
        max = 0;
        boolean[] notPrime = genPrimes(max);
        for (int[] num : nums) {
            for (int j = 0; j < nums.length; ++j) {
                if (num[j] == 2 || num[nums.length - 1 - j] == 2) {
                    max = Math.max(max, 2);
                }
                if (num[j] % 2 != 0 && !notPrime[num[j]]) {
                    max = Math.max(max, num[j]);
                }
                if (num[nums.length - 1 - j] % 2 != 0 && !notPrime[num[j]]) {
                    max = Math.max(max, num[nums.length - 1 - j]);
                }
            }
        }
        return max;
    }

    public boolean[] genPrimes(int n) {
        boolean[] res = new boolean[++n];
        res[0] = true;
        res[1] = true;
        for (int i = 3; i < n; i += 2) {
            if (res[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += 2 * i) {
                res[j] = true;
            }
        }
        return res;
    }
}
