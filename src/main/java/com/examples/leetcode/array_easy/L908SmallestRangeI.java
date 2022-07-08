package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/smallest-range-i/ */
public class L908SmallestRangeI {

    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return Math.max((max - k) - (min + k), 0);
    }
}
