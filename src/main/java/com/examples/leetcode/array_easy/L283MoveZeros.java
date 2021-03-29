package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/move-zeroes/ */
public class L283MoveZeros {

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 0) {
                ++count;
            }
        }

        int index = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[index++] = i;
            }
        }
        for (int i = index; i < nums.length; ++i) {
            nums[i] = 0;
        }
    }
}
