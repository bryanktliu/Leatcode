package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/valid-mountain-array/ */
public class L941ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        if (arr[0] >= arr[1] || arr[arr.length - 1] >= arr[arr.length - 2]) {
            return false;
        }
        boolean up = true;
        for (int i = 2; i < arr.length - 1; ++i) {
            if (up) {
                if (arr[i] <= arr[i - 1]) {
                    up = false;
                }
            } else {
                if (arr[i] >= arr[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
