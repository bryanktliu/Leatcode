package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/ */
public class L1827MinimumOperationsToMakeTheArrayIncreasing {

    public int minOperations(int[] nums) {
        int sum = 0;
        int current = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] <= current) {
                sum += current - nums[i] + 1;
                ++current;
            } else {
                current = nums[i];
            }
        }
        return sum;
    }
}
