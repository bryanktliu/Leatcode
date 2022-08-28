package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-hills-and-valleys-in-an-array/ */
public class L2210CountHillsAndValleysInAnArray {

    public int countHillValley(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int left = 0;
        int right = 2;
        int count = 0;
        for (int i = 1; i < nums.length - 1; ++i) {
            if (nums[i] > nums[left] && nums[i] > nums[right]
                    || nums[i] < nums[left] && nums[i] < nums[right]) {
                ++count;
                left = i;
            }
            ++right;
        }
        return count;
    }
}
