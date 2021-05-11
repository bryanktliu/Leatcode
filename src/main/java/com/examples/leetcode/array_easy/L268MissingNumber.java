package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/missing-number/ */
public class L268MissingNumber {

    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; ++i) {
            result += i + 1 - nums[i];
        }
        return result;
    }
}
