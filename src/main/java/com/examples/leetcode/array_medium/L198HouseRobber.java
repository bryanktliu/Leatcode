package com.examples.leetcode.array_medium;

import java.util.Arrays;

/** https://leetcode.com/problems/house-robber/ */
public class L198HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(dp, 0, nums);
    }

    public int solve(int[] dp, int pos, int[] nums) {
        if (pos > nums.length - 1) {
            return 0;
        }
        if (dp[pos] != -1) {
            return dp[pos];
        }
        if (pos == nums.length - 1) {
            return nums[pos];
        }
        int max = nums[pos] + solve(dp, pos + 2, nums);
        max = Math.max(max, nums[pos + 1] + solve(dp, pos + 3, nums));
        dp[pos] = max;
        return max;
    }
}
