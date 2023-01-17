package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-ascending-subarray-sum/ */
public class L1800MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int current = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] <= nums[i - 1]) {
                max = Math.max(max, current);
                current = 0;
            }
            current += nums[i];
        }
        return Math.max(max, current);
    }
}
