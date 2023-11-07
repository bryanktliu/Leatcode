package com.examples.leetcode.array_easy;

import java.util.List;

/** https://leetcode.com/problems/minimum-right-shifts-to-sort-the-array/ */
public class L2855MinimumRightShiftsToSortTheArray {

    public int minimumRightShifts(List<Integer> nums) {
        int len = nums.size();
        int drop = 0;
        int first = 0;
        if (nums.get(len - 1) > nums.get(0)) {
            drop = 1;
        }
        for (int i = 1; i < nums.size(); ++i) {
            if (nums.get(i) < nums.get(i - 1)) {
                if (drop == 1) {
                    return -1;
                }
                drop = 1;
                first = len - i;
            }
        }
        return first;
    }
}
