package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/longest-continuous-increasing-subsequence/ */
public class L674LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 1;
        int current = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                ++current;
                if (length < current) {
                    length = current;
                }
            } else {
                current = 1;
            }
        }
        return length;
    }
}
