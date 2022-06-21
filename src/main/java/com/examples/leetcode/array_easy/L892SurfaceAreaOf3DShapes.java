package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/surface-area-of-3d-shapes/ */
public class L892SurfaceAreaOf3DShapes {

    public int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                area += getArea(grid, i, j);
            }
        }
        return area;
    }

    public int getArea(int[][] grid, int i, int j) {
        int area;
        if (grid[i][j] != 0) {
            area = 2;
        } else {
            area = 0;
        }
        if (i == 0) {
            area += grid[i][j];
        } else {
            area += Math.max(grid[i][j] - grid[i - 1][j], 0);
        }
        if (i == grid.length - 1) {
            area += grid[i][j];
        } else {
            area += Math.max(grid[i][j] - grid[i + 1][j], 0);
        }
        if (j == 0) {
            area += grid[i][j];
        } else {
            area += Math.max(grid[i][j] - grid[i][j - 1], 0);
        }
        if (j == grid.length - 1) {
            area += grid[i][j];
        } else {
            area += Math.max(grid[i][j] - grid[i][j + 1], 0);
        }
        return area;
    }
}
