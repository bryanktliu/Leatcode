package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-subarray/ */
public class L53MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
