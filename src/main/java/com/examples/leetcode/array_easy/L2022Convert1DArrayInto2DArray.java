package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/convert-1d-array-into-2d-array/ */
public class L2022Convert1DArrayInto2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][];
        }
        int index = 0;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                res[i][j] = original[index++];
            }
        }
        return res;
    }
}
