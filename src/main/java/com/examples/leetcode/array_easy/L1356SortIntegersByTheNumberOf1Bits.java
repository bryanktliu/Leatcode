package com.examples.leetcode.array_easy;

import java.util.Arrays;
import java.util.Comparator;

/** https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/ */
public class L1356SortIntegersByTheNumberOf1Bits {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] + Integer.bitCount(arr[i]) * 10001;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        }
        return arr;
    }
}
