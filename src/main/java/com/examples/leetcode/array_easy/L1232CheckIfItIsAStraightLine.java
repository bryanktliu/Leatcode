package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-it-is-a-straight-line/ */
public class L1232CheckIfItIsAStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        int ychange = coordinates[1][1] - coordinates[0][1];
        int xchange = coordinates[1][0] - coordinates[0][0];
        for (int i = 2; i < coordinates.length; ++i) {
            if (coordinates[i][0] == coordinates[0][0]) {
                if (xchange == 0) {
                    continue;
                }
                return false;
            }
            if (xchange == 0) {
                return false;
            }
            if (coordinates[0][1] + (coordinates[i][0] - coordinates[0][0]) * ychange / xchange
                    != coordinates[i][1]) {
                return false;
            }
        }
        return true;
    }
}
