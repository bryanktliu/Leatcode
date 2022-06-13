package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/search-in-rotated-sorted-array/ */
public class L33SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[start] <= nums[middle]) {
                if (nums[middle] < target || target < nums[start]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (nums[middle] > target || target > nums[end]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
