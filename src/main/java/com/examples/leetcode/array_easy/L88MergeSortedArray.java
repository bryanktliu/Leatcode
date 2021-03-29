package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/merge-sorted-array/ */
public class L88MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums1, 0, nums1, n, m);
        int x = n;
        int y = 0;
        for (int i = 0; i < m + n; ++i) {
            if (y >= n || x < m + n && nums1[x] < nums2[y]) {
                nums1[i] = nums1[x];
                ++x;
            } else {
                nums1[i] = nums2[y];
                ++y;
            }
        }
    }
}
