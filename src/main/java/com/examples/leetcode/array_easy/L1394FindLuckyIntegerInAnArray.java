package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-lucky-integer-in-an-array/ */
public class L1394FindLuckyIntegerInAnArray {

    public int findLucky(int[] arr) {
        int[] counts = new int[501];
        for (int i : arr) {
            ++counts[i];
        }
        for (int i = 500; i > 0; --i) {
            if (i == counts[i]) {
                return i;
            }
        }
        return -1;
    }
}
