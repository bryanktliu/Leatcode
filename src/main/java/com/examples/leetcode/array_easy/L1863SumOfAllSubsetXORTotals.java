package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sum-of-all-subset-xor-totals/ */
public class L1863SumOfAllSubsetXORTotals {

    public int subsetXORSum(int[] nums) {
        return solve(nums, 0, 0);
    }

    public int solve(int[] nums, int index, int current) {
        if (index == nums.length) {
            return current;
        }
        return solve(nums, index + 1, current) + solve(nums, index + 1, current ^ nums[index]);
    }
}
