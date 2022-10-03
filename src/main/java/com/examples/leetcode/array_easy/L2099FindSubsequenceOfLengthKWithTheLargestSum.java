package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/ */
public class L2099FindSubsequenceOfLengthKWithTheLargestSum {

    public int[] maxSubsequence(int[] nums, int k) {
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        int smallest = sorted[sorted.length - k];
        int count = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            if (sorted[i] == smallest) count++;
        }
        int[] ans = new int[k];
        int index = 0;
        for (int num : nums) {
            if (num > smallest) {
                ans[index] = num;
                ++index;
            } else if (num == smallest && count > 0) {
                ans[index] = num;
                ++index;
                --count;
            }
        }
        return ans;
    }
}
