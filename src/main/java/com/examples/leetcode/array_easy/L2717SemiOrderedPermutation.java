package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/semi-ordered-permutation/ */
public class L2717SemiOrderedPermutation {

    public int semiOrderedPermutation(int[] nums) {
        int pos1 = 0;
        int posn = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                pos1 = i;
            } else if (nums[i] == nums.length) {
                posn = i;
            }
        }
        if (pos1 > posn) {
            return pos1 + (nums.length - posn - 1) - 1;
        }
        return pos1 + (nums.length - posn - 1);
    }
}
