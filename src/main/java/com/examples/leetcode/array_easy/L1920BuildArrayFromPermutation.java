package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/build-array-from-permutation/ */
public class L1920BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        loop(nums, ans, 0);
        return ans;
    }

    public void loop(int[] nums, int[] ans, int i) {
        if (i == nums.length) {
            return;
        }
        ans[i] = nums[nums[i]];
        loop(nums, ans, i + 1);
    }
}
