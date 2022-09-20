package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/ */
public class L2357MakeArrayZeroBySubtractingEqualAmounts {

    public int minimumOperations(int[] nums) {
        boolean[] seen = new boolean[101];
        for (int num : nums) {
            seen[num] = true;
        }
        int operations = 0;
        for (int i = 1; i < seen.length; ++i) {
            if (seen[i]) {
                ++operations;
            }
        }
        return operations;
    }
}
