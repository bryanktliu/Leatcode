package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/ */
public class L2639FindTheWidthOfColumnsOfAGrid {

    public int[] findColumnWidth(int[][] grid) {
        int[] maxes = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; ++i) {
            for (int[] col : grid) {
                maxes[i] = Math.max(getWidth(col[i]), maxes[i]);
            }
        }
        return maxes;
    }

    public int getWidth(int num) {
        if (num == 0) {
            return 1;
        }
        int len = (int) Math.log10(Math.abs(num)) + 1;
        if (num < 0) {
            return len + 1;
        }
        return len;
    }
}
