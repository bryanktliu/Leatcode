package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-pivot-index/ */
public class L724FindPivotIndex {

    public int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[i] += nums[i - 1];
        }
        if (nums[nums.length - 1] - nums[0] == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] == nums[nums.length - 1] - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
