package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/three-consecutive-odds/ */
public class L1550ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if ((i & 1) == 1) {
                if (++count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
