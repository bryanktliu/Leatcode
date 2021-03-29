package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/transpose-matrix/ */
public class L867TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] ret = new int[column][row];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                ret[j][i] = matrix[i][j];
            }
        }
        return ret;
    }
}
