package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/search-insert-position/ */
public class L35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            return (index + 1) * -1;
        }
        return index;
    }
}
