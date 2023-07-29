package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-array-is-good/ */
public class L2784CheckIfArrayIsGood {

    public boolean isGood(int[] nums) {
        int[] seen = new int[nums.length];
        for (int num : nums) {
            if (num >= nums.length) {
                return false;
            }
            if (seen[num] > 1 || (seen[num] == 1 && num != nums.length - 1)) {
                return false;
            }
            ++seen[num];
        }
        return true;
    }
}
