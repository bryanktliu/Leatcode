package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-array-formation-through-concatenation/ */
public class L1640CheckArrayFormationThroughConcatenation {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] positions = new int[101];
        for (int i = 0; i < arr.length; ++i) {
            positions[arr[i]] = i + 1;
        }
        for (int[] row : pieces) {
            int first = positions[row[0]];
            if (first == 0) {
                return false;
            }
            for (int i = 1; i < row.length; ++i) {
                if (positions[row[i]] != ++first) {
                    return false;
                }
            }
        }
        return true;
    }
}
