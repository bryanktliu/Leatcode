package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/ */
public class L1287ElementAppearingMoreThan25InSortedArray {

    public int findSpecialInteger(int[] arr) {
        int threshold = arr.length / 4;
        int count = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == arr[i - 1]) {
                if (++count > threshold) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        return arr[0];
    }
}
