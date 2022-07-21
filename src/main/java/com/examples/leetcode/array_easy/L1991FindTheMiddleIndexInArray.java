package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-middle-index-in-array/ */
public class L1991FindTheMiddleIndexInArray {

    public int findMiddleIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int current = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (current == total - nums[i] - current) {
                return i;
            }
            current += nums[i];
        }
        return -1;
    }
}
