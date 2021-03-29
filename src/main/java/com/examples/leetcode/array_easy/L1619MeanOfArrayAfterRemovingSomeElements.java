package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/mean-of-array-after-removing-some-elements/ */
public class L1619MeanOfArrayAfterRemovingSomeElements {

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length * 5 / 100;

        int sum = 0;
        for (int i = length; i < arr.length - length; ++i) {
            sum += arr[i];
        }
        return ((double) sum) / (arr.length - 2 * length);
    }
}
