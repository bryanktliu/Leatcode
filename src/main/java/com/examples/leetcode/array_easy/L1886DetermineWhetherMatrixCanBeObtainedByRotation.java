package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/ */
public class L1886DetermineWhetherMatrixCanBeObtainedByRotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        if (isRight(mat, target)) {
            return true;
        }
        if (isLeft(mat, target)) {
            return true;
        }
        if (isReversed(mat, target)) {
            return true;
        }
        return isSame(mat, target);
    }

    public boolean isRight(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat.length; ++j) {
                if (mat[i][j] != target[j][mat.length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isReversed(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat.length; ++j) {
                if (mat[i][j] != target[mat.length - i - 1][mat.length - j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isLeft(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat.length; ++j) {
                if (mat[i][j] != target[mat.length - j - 1][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSame(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat.length; ++j) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
