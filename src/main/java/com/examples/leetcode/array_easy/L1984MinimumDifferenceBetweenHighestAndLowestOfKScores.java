package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/ */
public class L1984MinimumDifferenceBetweenHighestAndLowestOfKScores {

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        --k;
        int min = Integer.MAX_VALUE;
        for (int i = k; i < nums.length; ++i) {
            min = Math.min(min, nums[i] - nums[i - k]);
        }
        return min;
    }
}
