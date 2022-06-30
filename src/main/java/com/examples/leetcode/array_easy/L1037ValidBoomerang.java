package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/valid-boomerang/ */
public class L1037ValidBoomerang {

    public boolean isBoomerang(int[][] points) {
        int slope1 = (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
        int slope2 = (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
        return slope1 != slope2;
    }
}
