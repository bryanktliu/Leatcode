package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/ */
public class L1779FindNearestPointThatHasTheSameXOrYCoordinate {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int dif = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x) {
                if (dif > Math.abs(points[i][1] - y)) {
                    dif = Math.abs(points[i][1] - y);
                    index = i;
                }
            } else if (points[i][1] == y) {
                if (dif > Math.abs(points[i][0] - x)) {
                    dif = Math.abs(points[i][0] - x);
                    index = i;
                }
            }
        }
        return index;
    }
}
