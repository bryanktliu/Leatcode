package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/toeplitz-matrix/ */
public class L766ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length - 1; ++i) {
            int size = Math.min(matrix.length, matrix[0].length - i);
            for (int j = 1; j < size; ++j) {
                if (matrix[j][i + j] != matrix[0][i]) {
                    return false;
                }
            }
        }

        for (int i = 1; i < matrix.length; ++i) {
            int size = Math.min(matrix[0].length, matrix.length - i);
            for (int j = 1; j < size; ++j) {
                if (matrix[i + j][j] != matrix[i][0]) {
                    return false;
                }
            }
        }
        return true;
    }
}
