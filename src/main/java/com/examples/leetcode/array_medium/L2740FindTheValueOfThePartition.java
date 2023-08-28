package com.examples.leetcode.array_medium;

import java.util.Arrays;

/** https://leetcode.com/problems/find-the-value-of-the-partition/ */
public class L2740FindTheValueOfThePartition {

    public int findValueOfPartition(int[] nums) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            min = Math.min(min, nums[i] - nums[i - 1]);
        }
        return min;
    }
}
