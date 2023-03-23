package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/largest-local-values-in-a-matrix/ */
public class L2373LargestLocalValuesInAMatrix {

    public int[][] largestLocal(int[][] grid) {
        int len = grid.length - 2;
        int[][] res = new int[len][len];
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                res[i][j] = getMax(grid, i + 1, j + 1);
            }
        }
        return res;
    }

    public int getMax(int[][] grid, int i, int j) {
        int max = grid[i][j];
        max = Math.max(max, grid[i - 1][j]);
        max = Math.max(max, grid[i - 1][j + 1]);
        max = Math.max(max, grid[i][j + 1]);
        max = Math.max(max, grid[i + 1][j + 1]);
        max = Math.max(max, grid[i + 1][j]);
        max = Math.max(max, grid[i + 1][j - 1]);
        max = Math.max(max, grid[i][j - 1]);
        max = Math.max(max, grid[i - 1][j - 1]);
        return max;
    }
}
