package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/find-the-distance-value-between-two-arrays/ */
public class L1385FindTheDistanceValueBetweenTwoArrays {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int i : arr1) {
            int index = Arrays.binarySearch(arr2, i);
            if (index < 0) {
                index = -(index + 1);
                if (index > 0 && Math.abs(arr2[index - 1] - i) <= d) {
                    continue;
                }
                if (index < arr2.length && Math.abs(arr2[index] - i) <= d) {
                    continue;
                }
                ++count;
            }
        }
        return count;
    }
}
