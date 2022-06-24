package com.examples.leetcode.array_easy;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class L704BinarySearch {

    public int search(int[] nums, int target) {
        int small = 0;
        int big = nums.length - 1;
        while (big >= small) {
            int middle = (small + big) / 2;
            if(nums[middle] > target) {
                big = middle - 1;
            } else if(nums[middle] < target) {
                small = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
