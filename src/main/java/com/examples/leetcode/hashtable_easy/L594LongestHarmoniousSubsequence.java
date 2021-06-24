package com.examples.leetcode.hashtable_easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-harmonious-subsequence/
 */
public class L594LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        int len = 0;
        int num2 = nums[0];
        int len2 = 0;
        int max = 0;
        for (int value : nums) {
            if (value != num) {
                if(value != num2 && num != num2) {
                    if (num + 1 == num2) {
                        max = Math.max(max, len + len2);
                    }
                    num = num2;
                    num2 = value;
                    len = len2;
                    len2 = 1;
                } else {
                    num2 = value;
                    ++len2;
                }
            } else {
                ++len;
            }
        }
        if (num + 1 == num2) {
            max = Math.max(max, len + len2);
        }
        return max;
    }
}
