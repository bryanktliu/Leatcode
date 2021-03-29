package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-time-visiting-all-points/ */
public class L1266MinimumTimeVisitingAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 1; i < points.length; ++i) {
            int x = Math.abs(points[i][0] - points[i - 1][0]);
            int y = Math.abs(points[i][1] - points[i - 1][1]);
            sum += Math.max(x, y);
        }
        return sum;
    }
}
