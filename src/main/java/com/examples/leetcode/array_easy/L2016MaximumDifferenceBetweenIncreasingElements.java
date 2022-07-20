package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-difference-between-increasing-elements/ */
public class L2016MaximumDifferenceBetweenIncreasingElements {

    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int max = -1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
            } else {
                int dif = nums[i] - min;
                if (dif > max) {
                    max = dif;
                }
            }
        }
        if (max == 0) {
            return -1;
        }
        return max;
    }
}
