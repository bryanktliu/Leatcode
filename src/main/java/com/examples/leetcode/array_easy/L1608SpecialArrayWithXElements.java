package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/ */
public class L1608SpecialArrayWithXElements {

    public int specialArray(int[] nums) {
        int[] map = new int[1001];
        for (int i : nums) {
            ++map[i];
        }
        int count = nums.length;
        for (int i = 0; i <= nums.length; ++i) {
            if (i == count) {
                return i;
            } else if (i > count) {
                return -1;
            }
            count -= map[i];
        }
        return -1;
    }
}
