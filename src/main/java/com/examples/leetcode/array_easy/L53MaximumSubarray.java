package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-subarray/ */
public class L53MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int num : nums) {
            current += num;
            if (current > max) {
                max = current;
            }
            if (current <= 0) {
                current = 0;
            }
        }
        return max;
    }
}
