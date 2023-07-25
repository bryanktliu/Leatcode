package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/neither-minimum-nor-maximum/ */
public class L2733NeitherMinimumNorMaximum {

    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        if (nums[0] > nums[1]) {
            if (nums[1] > nums[2]) {
                return nums[1];
            }
            return Math.min(nums[0], nums[2]);
        }
        if (nums[0] < nums[2]) {
            return Math.min(nums[1], nums[2]);
        }
        return nums[0];
    }
}
