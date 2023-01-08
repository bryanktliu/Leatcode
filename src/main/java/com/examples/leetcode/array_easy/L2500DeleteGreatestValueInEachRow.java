package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/delete-greatest-value-in-each-row/ */
public class L2500DeleteGreatestValueInEachRow {

    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) {
            Arrays.sort(row);
        }
        int sum = 0;
        for (int i = 0; i < grid[0].length; ++i) {
            int max = 0;
            for (int[] row : grid) {
                if (row[i] > max) {
                    max = row[i];
                }
            }
            sum += max;
        }
        return sum;
    }
}
