package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/jump-game/ */
public class L55JumpGame {

    public boolean canJump(int[] nums) {
        return reachable(nums, nums.length - 1);
    }

    public boolean reachable(int[] nums, int pos) {
        int zero = -1;
        for (int i = pos - 1; i >= 0; --i) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }
        if (zero == -1) {
            return true;
        }
        for (int i = zero - 1; i >= 0; --i) {
            if (i + nums[i] > zero) {
                if (reachable(nums, i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
