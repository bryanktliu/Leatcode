package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/ */
public class L2908MinimumSumOfMountainTripletsI {

    public int minimumSum(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            left[i] = Math.min(left[i - 1], nums[i - 1]);
        }
        int min = Integer.MAX_VALUE;
        int right = nums[nums.length - 1];
        for (int i = nums.length - 2; i > 0; --i) {
            right = Math.min(right, nums[i + 1]);
            if (left[i] < nums[i] && nums[i] > right) {
                min = Math.min(left[i] + nums[i] + right, min);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}
