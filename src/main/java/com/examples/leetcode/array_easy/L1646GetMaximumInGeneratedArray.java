package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/get-maximum-in-generated-array/ */
public class L1646GetMaximumInGeneratedArray {

    public int getMaximumGenerated(int n) {
        if (n < 2) {
            return n;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        int max = 0;
        for (int i = 2; i <= n; ++i) {
            int index = i / 2;
            if ((i & 1) == 1) {
                nums[i] = nums[index] + nums[index + 1];
            } else {
                nums[i] = nums[index];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
