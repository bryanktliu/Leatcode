package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/ */
public class L1413MinimumValueToGet {

    public int minStartValue(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            minSum = Math.min(minSum, sum);
        }
        if (minSum >= 0) {
            return 1;
        }
        return 1 - minSum;
    }
}
