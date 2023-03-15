package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/ */
public class L2570MergeTwo2DArraysBySummingValues {

    public int[][] mergeArrays(int[][] num1, int[][] nums2) {
        int index1 = 0;
        int index2 = 0;
        int len = 0;
        while (index1 < num1.length && index2 < nums2.length) {
            if (num1[index1][0] == nums2[index2][0]) {
                ++index1;
                ++index2;
                ++len;
            } else if (num1[index1][0] < nums2[index2][0]) {
                ++index1;
                ++len;
            } else {
                ++index2;
                ++len;
            }
        }
        if (index1 < num1.length) {
            len += num1.length - index1;
        } else if (index2 < nums2.length) {
            len += nums2.length - index2;
        }
        int[][] res = new int[len][2];
        index1 = 0;
        index2 = 0;
        int index3 = 0;
        while (index1 < num1.length && index2 < nums2.length) {
            if (num1[index1][0] == nums2[index2][0]) {
                res[index3][0] = num1[index1][0];
                res[index3][1] = num1[index1][1] + nums2[index2][1];
                ++index1;
                ++index2;
                ++index3;
            } else if (num1[index1][0] < nums2[index2][0]) {
                res[index3][0] = num1[index1][0];
                res[index3][1] = num1[index1][1];
                ++index3;
                ++index1;
            } else {
                res[index3][0] = nums2[index2][0];
                res[index3][1] = nums2[index2][1];
                ++index3;
                ++index2;
            }
        }
        while (index1 < num1.length) {
            res[index3][0] = num1[index1][0];
            res[index3][1] = num1[index1][1];
            ++index3;
            ++index1;
        }
        while (index2 < nums2.length) {
            res[index3][0] = nums2[index2][0];
            res[index3][1] = nums2[index2][1];
            ++index3;
            ++index2;
        }
        return res;
    }
}
