package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/squares-of-a-sorted-array/ */
public class L977SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int right = Arrays.binarySearch(nums, 0);
        if (right < 0) {
            right = -(right + 1);
        }
        int[] ret = new int[nums.length];
        int left = right - 1;
        for (int i = 0; i < nums.length; ++i) {
            if (right >= nums.length || left >= 0 && -nums[left] < nums[right]) {
                ret[i] = nums[left] * nums[left];
                --left;
            } else {
                ret[i] = nums[right] * nums[right];
                ++right;
            }
        }
        return ret;
    }
}
