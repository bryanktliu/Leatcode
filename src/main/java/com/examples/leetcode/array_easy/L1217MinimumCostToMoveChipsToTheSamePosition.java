package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/ */
public class L1217MinimumCostToMoveChipsToTheSamePosition {

    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }
        return Math.min(odd, even);
    }
}
