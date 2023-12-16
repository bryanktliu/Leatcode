package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/ */
public class L2946MatrixSimilarityAfterCyclicShifts {

    public boolean areSimilar(int[][] mat, int k) {
        k %= mat[0].length;
        for (int i = 0; i < mat.length; i += 2) {
            for (int j = 0; j < mat[i].length; ++j) {
                if (mat[i][j] != mat[i][(j + k) % mat[i].length]) {
                    return false;
                }
            }
        }
        for (int i = 1; i < mat.length; i += 2) {
            for (int j = 0; j < mat[i].length; ++j) {
                if (mat[i][j] != mat[i][(j + mat[i].length - k) % mat[i].length]) {
                    return false;
                }
            }
        }
        return true;
    }
}
