package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/image-smoother/ */
public class L661ImageSmoother {

    public int[][] imageSmoother(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ret = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                ret[i][j] = smooth(matrix, i, j);
            }
        }
        return ret;
    }

    private int smooth(int[][] matrix, int row, int col) {
        int sum = matrix[row][col];
        int count = 1;
        if (row > 0) {
            sum += matrix[row - 1][col];
            ++count;
            if (col > 0) {
                sum += matrix[row - 1][col - 1];
                ++count;
            }
            if (col < matrix[0].length - 1) {
                sum += matrix[row - 1][col + 1];
                ++count;
            }
        }
        if (row < matrix.length - 1) {
            sum += matrix[row + 1][col];
            ++count;
            if (col > 0) {
                sum += matrix[row + 1][col - 1];
                ++count;
            }
            if (col < matrix[0].length - 1) {
                sum += matrix[row + 1][col + 1];
                ++count;
            }
        }
        if (col > 0) {
            sum += matrix[row][col - 1];
            ++count;
        }
        if (col < matrix[0].length - 1) {
            sum += matrix[row][col + 1];
            ++count;
        }
        return sum / count;
    }
}
