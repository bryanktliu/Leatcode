package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/next-permutation/description/ */
public class L31NextPermutation {

    public void nextPermutation(int[] nums) {
        int lower = -1;
        for (int i = nums.length - 2; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) {
                lower = i;
                break;
            }
        }
        if (lower > -1) {
            for (int i = nums.length - 1; i > lower; --i) {
                if (nums[i] > nums[lower]) {
                    int temp = nums[lower];
                    nums[lower] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        reverse(nums, lower + 1, nums.length - 1);
    }

    public void reverse(int[] nums, int lower, int upper) {
        while (lower < upper) {
            int temp = nums[lower];
            nums[lower++] = nums[upper];
            nums[upper--] = temp;
        }
    }
}
