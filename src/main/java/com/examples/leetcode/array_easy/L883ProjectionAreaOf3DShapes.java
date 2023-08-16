package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/projection-area-of-3d-shapes/ */
public class L883ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; ++i) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < grid.length; ++j) {
                if (grid[i][j] != 0) {
                    ++sum;
                }
                if (row < grid[i][j]) {
                    row = grid[i][j];
                }
                if (col < grid[j][i]) {
                    col = grid[j][i];
                }
            }
            sum += row + col;
        }
        return sum;
    }
}
