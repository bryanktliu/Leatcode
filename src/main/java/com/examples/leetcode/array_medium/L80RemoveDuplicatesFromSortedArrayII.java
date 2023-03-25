package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/ */
public class L80RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        boolean second = false;
        int last = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == last) {
                if (second) {
                    continue;
                }
                second = true;
                ++index;
            } else {
                second = false;
                last = nums[i];
                nums[index] = nums[i];
                ++index;
            }
        }
        return index;
    }
}
