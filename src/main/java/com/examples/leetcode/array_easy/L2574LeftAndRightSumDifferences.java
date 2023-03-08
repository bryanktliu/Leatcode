package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/left-and-right-sum-differences/ */
public class L2574LeftAndRightSumDifferences {

    public int[] leftRigthDifference(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = 0;
        for (int num : nums) {
            right += num;
        }
        for (int i = 0; i < nums.length; ++i) {
            right -= nums[i];
            res[i] = Math.abs(left - right);
            left += nums[i];
        }
        return res;
    }
}
