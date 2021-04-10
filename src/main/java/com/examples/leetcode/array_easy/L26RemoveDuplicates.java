package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */
public class L26RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int index = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != last) {
                last = nums[i];
                nums[index++] = nums[i];
                last = nums[i];
            }
        }
        return index;
    }
}
