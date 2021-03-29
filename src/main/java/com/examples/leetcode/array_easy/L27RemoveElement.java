package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/remove-element/ */
public class L27RemoveElement {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != val && i != index) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
