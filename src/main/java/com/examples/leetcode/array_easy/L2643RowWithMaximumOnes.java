package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/row-with-maximum-ones/ */
public class L2643RowWithMaximumOnes {

    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int maxPos = 0;
        for (int i = 0; i < mat.length; ++i) {
            int current = 0;
            for (int j = 0; j < mat[i].length; ++j) {
                current += mat[i][j];
            }
            if (current > max) {
                max = current;
                maxPos = i;
            }
        }
        return new int[] {maxPos, max};
    }
}
