package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/merge-sorted-array/ */
public class L88MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
