package com.examples.leetcode.array_easy;

/**
 * https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/
 */
public class L2133CheckIfEveryRowAndColumnContainsAllNumbers {

    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            boolean[] row = new boolean[matrix.length + 1];
            boolean[] col = new boolean[matrix.length + 1];
            for (int j = 0; j < matrix.length; ++j) {
                if (row[matrix[i][j]] || col[matrix[j][i]]) {
                    return false;
                }
                row[matrix[i][j]] = true;
                col[matrix[j][i]] = true;
            }
        }
        return true;
    }
}
