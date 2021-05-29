package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/ */
public class L1752CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        int changed = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1]) {
                ++changed;
            }
            if (changed == 2) {
                return false;
            }
        }
        return !(changed == 1 && nums[0] < nums[nums.length - 1]);
    }
}
