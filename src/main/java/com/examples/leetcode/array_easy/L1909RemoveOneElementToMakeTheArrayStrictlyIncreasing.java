package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/ */
public class L1909RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    public boolean canBeIncreasing(int[] nums) {
        boolean changed = false;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] <= nums[i - 1]) {
                if (changed) {
                    return false;
                }
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
                changed = true;
            }
        }
        return true;
    }
}
