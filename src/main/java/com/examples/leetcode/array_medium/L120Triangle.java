package com.examples.leetcode.array_medium;

import java.util.List;

/** https://leetcode.com/problems/triangle/ */
public class L120Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        return solve(triangle, new Integer[triangle.size()][triangle.size()], 0, 0);
    }

    public int solve(List<List<Integer>> triangle, Integer[][] dp, int i, int j) {
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        int cost = triangle.get(i).get(j);
        if (i < triangle.size() - 1) {
            cost += Math.min(solve(triangle, dp, i + 1, j), solve(triangle, dp, i + 1, j + 1));
        }
        dp[i][j] = cost;
        return cost;
    }
}
