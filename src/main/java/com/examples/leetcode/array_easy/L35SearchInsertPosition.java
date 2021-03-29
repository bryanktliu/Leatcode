package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/search-insert-position/ */
public class L35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int pos = Arrays.binarySearch(nums, target);
        if (pos < 0) {
            return -(pos + 1);
        }
        return pos;
    }
}
