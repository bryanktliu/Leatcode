package com.examples.leetcode.array_easy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/ */
public class L1252CellsWithOddValuesInAMatrix {

    public int oddCells(int n, int m, int[][] indices) {
        Map<Integer, Boolean> mapR = new ConcurrentHashMap<>();
        Map<Integer, Boolean> mapC = new ConcurrentHashMap<>();
        for (int[] row : indices) {
            mapR.merge(row[0], true, Boolean::logicalXor);
            mapC.merge(row[1], true, Boolean::logicalXor);
        }
        int countR = 0;
        for (Boolean b : mapR.values()) {
            if (b) {
                ++countR;
            }
        }
        int countC = 0;
        for (Boolean b : mapC.values()) {
            if (b) {
                ++countC;
            }
        }
        return countR * (m - countC) + countC * (n - countR);
    }
}
