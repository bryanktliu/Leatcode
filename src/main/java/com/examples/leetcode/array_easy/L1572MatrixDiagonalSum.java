package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/matrix-diagonal-sum/ */
public class L1572MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; ++i) {
            sum += mat[i][i] + mat[mat.length - i - 1][i];
        }
        if (mat.length % 2 == 1) {
            int center = mat.length / 2;
            sum -= mat[center][center];
        }
        return sum;
    }
}
