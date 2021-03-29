package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/running-sum-of-1d-array/ */
public class L1480RunningSumOf1dArray {

    public int[] runningSum(int[] arr) {
        int[] ret = new int[arr.length];
        ret[0] = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            ret[i] = ret[i - 1] + arr[i];
        }
        return ret;
    }
}
