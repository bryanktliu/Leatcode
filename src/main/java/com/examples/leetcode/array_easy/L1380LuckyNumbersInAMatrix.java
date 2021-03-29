package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/lucky-numbers-in-a-matrix/ */
public class L1380LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        OUTER:
        for (int[] row : matrix) {
            int min = Integer.MAX_VALUE;
            int col = -1;
            for (int i = 0; i < row.length; ++i) {
                if (row[i] < min) {
                    col = i;
                    min = row[i];
                }
            }
            for (int[] ints : matrix) {
                if (ints[col] > min) {
                    continue OUTER;
                }
            }
            ret.add(min);
        }
        return ret;
    }
}
