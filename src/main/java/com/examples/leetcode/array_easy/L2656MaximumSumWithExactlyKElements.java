package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/ */
public class L2656MaximumSumWithExactlyKElements {

    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            max = Math.max(max, nums[i]);
        }
        return k * (2 * max + (k - 1)) / 2;
    }
}
