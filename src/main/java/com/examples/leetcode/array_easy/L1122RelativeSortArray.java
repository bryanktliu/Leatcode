package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/relative-sort-array/ */
public class L1122RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        for (int i : arr1) {
            ++nums[i];
        }
        int index = 0;
        for (int i : arr2) {
            for (int j = 0; j < nums[i]; ++j) {
                arr1[index++] = i;
            }
            nums[i] = 0;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                for (int j = 0; j < nums[i]; ++j) {
                    arr1[index++] = i;
                }
            }
        }
        return arr1;
    }
}
