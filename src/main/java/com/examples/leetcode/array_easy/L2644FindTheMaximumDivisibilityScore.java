package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-maximum-divisibility-score/ */
public class L2644FindTheMaximumDivisibilityScore {

    public int maxDivScore(int[] nums, int[] divisors) {
        int max = 0;
        int maxNum = divisors[0];
        for (int divisor : divisors) {
            int current = 0;
            for (int num : nums) {
                if (num % divisor == 0) {
                    ++current;
                }
            }
            if (current == max) {
                maxNum = Math.min(maxNum, divisor);
            } else if (current > max) {
                max = current;
                maxNum = divisor;
            }
        }
        return maxNum;
    }
}
