package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/monotonic-array */
public class L896MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        if (nums.length < 1) {
            return true;
        }
        if (nums[0] == nums[nums.length - 1]) {
            for (int i = 1; i < nums.length - 1; ++i) {
                if (nums[i] != nums[0]) {
                    return false;
                }
            }
            return true;
        }
        boolean b = nums[0] > nums[nums.length - 1];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (b == nums[i] > nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
