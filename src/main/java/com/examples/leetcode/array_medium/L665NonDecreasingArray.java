package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/non-decreasing-array/ */
public class L665NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        int passed = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] > nums[i]) {
                if (passed > 0) {
                    return false;
                } else {
                    ++passed;
                    if (i >= 2 && nums[i - 2] > nums[i]) {
                        nums[i] = nums[i - 1];
                    } else {
                        nums[0] = Integer.MIN_VALUE;
                    }
                }
            }
        }
        return true;
    }
}
