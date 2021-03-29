package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/ */
public class L1337TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ret = new int[k];
        int index = 0;
        for (int col = 0; col < mat[0].length; ++col) {
            for (int row = 0; row < mat.length; ++row) {
                if (mat[row][col] == 0) {
                    Arrays.fill(mat[row], -1);
                    ret[index] = row;
                    if (++index >= k) {
                        return ret;
                    }
                }
            }
        }
        for (int row = 0; row < mat.length; ++row) {
            if (mat[row][0] == 1) {
                ret[index] = row;
                if (++index >= k) {
                    return ret;
                }
            }
        }
        return ret;
    }
}
