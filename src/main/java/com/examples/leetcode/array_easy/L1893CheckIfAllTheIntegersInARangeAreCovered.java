package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/ */
public class L1893CheckIfAllTheIntegersInARangeAreCovered {

    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; ++i) {
            boolean covered = false;
            for (int[] range : ranges) {
                if (i >= range[0] && i <= range[1]) {
                    covered = true;
                    break;
                }
            }
            if (!covered) {
                return false;
            }
        }
        return true;
    }
}
