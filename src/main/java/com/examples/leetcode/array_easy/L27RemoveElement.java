package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/remove-element/ */
public class L27RemoveElement {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
