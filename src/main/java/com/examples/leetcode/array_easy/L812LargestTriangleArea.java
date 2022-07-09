package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/largest-triangle-area/ */
public class L812LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int i = 0; i < points.length; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
                for (int k = j + 1; k < points.length; ++k) {
                    double temp = calculateArea(points[i], points[j], points[k]);
                    if (area < temp) {
                        area = temp;
                    }
                }
            }
        }
        return area;
    }

    public double calculateArea(int[] point1, int[] point2, int[] point3) {
        return Math.abs(
                        point1[0] * (point2[1] - point3[1])
                                + point2[0] * (point3[1] - point1[1])
                                + point3[0] * (point1[1] - point2[1]))
                / 2.0;
    }
}
