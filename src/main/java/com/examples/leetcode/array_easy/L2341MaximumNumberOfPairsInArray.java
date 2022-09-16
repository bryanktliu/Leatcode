package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-number-of-pairs-in-array/ */
public class L2341MaximumNumberOfPairsInArray {

    public int[] numberOfPairs(int[] nums) {
        boolean[] count = new boolean[101];
        int[] ans = new int[2];
        for (int num : nums) {
            if (count[num]) {
                ++ans[0];
                count[num] = false;
            } else {
                count[num] = true;
            }
        }
        for (boolean num : count) {
            if (num) {
                ++ans[1];
            }
        }
        return ans;
    }
}
