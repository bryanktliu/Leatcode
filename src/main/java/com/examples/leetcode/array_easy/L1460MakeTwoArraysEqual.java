package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/ */
public class L1460MakeTwoArraysEqual {

    public boolean canBeEqual(int[] target, int[] arr) {
        int[] counts1 = new int[1001];
        int[] counts2 = new int[1001];
        for (int i : target) {
            ++counts1[i];
        }
        for (int i : arr) {
            ++counts2[i];
        }
        return Arrays.equals(counts1, counts2);
    }
}
