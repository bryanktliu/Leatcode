package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-strong-pair-xor-i/ */
public class L2932MaximumStrongPairXORI {

    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                int xor = nums[i] ^ nums[j];
                if (xor > max && Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    max = xor;
                }
            }
        }
        return max;
    }
}
