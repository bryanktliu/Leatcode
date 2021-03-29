package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/flipping-an-image/ */
public class L832FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] matrix) {
        boolean odd = matrix[0].length % 2 == 1;
        int middle = matrix[0].length >>> 1;
        for (int[] row : matrix) {
            for (int i = 0; i < middle; ++i) {
                int mirror = row.length - i - 1;
                if (row[i] == row[row.length - i - 1]) {
                    row[i] = row[i] == 0 ? 1 : 0;
                    row[mirror] = row[i];
                }
            }
            if (odd) {
                row[middle] = row[middle] == 0 ? 1 : 0;
            }
        }
        return matrix;
    }
}
