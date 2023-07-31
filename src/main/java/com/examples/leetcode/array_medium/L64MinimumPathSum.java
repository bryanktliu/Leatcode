package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/minimum-path-sum/ */
public class L64MinimumPathSum {

    public int minPathSum(int[][] grid) {
        return solve(grid, new int[grid.length][grid[0].length], 0, 0);
    }

    public int solve(int[][] grid, int[][] dp, int i, int j) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        int cost = 0;
        if (i < grid.length - 1) {
            cost = grid[i][j] + solve(grid, dp, i + 1, j);
            if (j < grid[0].length - 1) {
                cost = Math.min(cost, grid[i][j] + solve(grid, dp, i, j + 1));
            }
        } else {
            cost = grid[i][j] + solve(grid, dp, i, j + 1);
        }
        dp[i][j] = cost;
        return cost;
    }
}
