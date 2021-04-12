package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/largest-number-at-least-twice-of-others/ */
public class L747LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int largest = 0;
        int second = -1;
        for (int i = 1; i < nums.length; ++i) {
            if (second == -1) {
                if (nums[largest] < nums[i]) {
                    second = largest;
                    largest = i;
                } else {
                    second = i;
                }
            } else if (nums[second] < nums[i]) {
                if (nums[largest] < nums[i]) {
                    second = largest;
                    largest = i;
                } else {
                    second = i;
                }
            }
        }
        if (nums[largest] >= nums[second] * 2) {
            return largest;
        }
        return -1;
    }
}
