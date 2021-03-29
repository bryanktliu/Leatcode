package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/special-positions-in-a-binary-matrix/ */
public class L1582SpecialPositionsInABinaryMatrix {

    public int numSpecial(int[][] mat) {
        boolean[] rows = new boolean[mat.length];
        boolean[] cols = new boolean[mat[0].length];
        for (int i = 0; i < mat.length; ++i) {
            int count = 0;
            for (int j = 0; j < mat[0].length; ++j) {
                if (mat[i][j] == 1 && ++count > 1) {
                    break;
                }
            }
            if (count == 1) {
                rows[i] = true;
            }
        }
        for (int i = 0; i < mat[0].length; ++i) {
            int count = 0;
            for (int[] ints : mat) {
                if (ints[i] == 1 && ++count > 1) {
                    break;
                }
            }
            if (count == 1) {
                cols[i] = true;
            }
        }

        int total = 0;
        for (int i = 0; i < mat.length; ++i) {
            if (!rows[i]) {
                continue;
            }
            for (int j = 0; j < mat[0].length; ++j) {
                if (!cols[j]) {
                    continue;
                }
                if (mat[i][j] == 1) {
                    ++total;
                }
            }
        }
        return total;
    }
}
