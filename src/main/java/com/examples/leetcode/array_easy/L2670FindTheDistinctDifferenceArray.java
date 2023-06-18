package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-distinct-difference-array/ */
public class L2670FindTheDistinctDifferenceArray {

    public int[] distinctDifferenceArray(int[] nums) {
        int[] left = new int[51];
        int[] right = new int[51];
        int leftCount = 0;
        int rightCount = 0;
        for (int num : nums) {
            if (right[num] == 0) {
                ++rightCount;
            }
            ++right[num];
        }
        int[] diff = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            --right[nums[i]];
            ++left[nums[i]];
            if (right[nums[i]] == 0) {
                --rightCount;
            }
            if (left[nums[i]] == 1) {
                ++leftCount;
            }
            diff[i] = leftCount - rightCount;
        }
        return diff;
    }
}
