package com.examples.leetcode.array_easy;

/**
 * https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
 */
public class L2529MaximumCountOfPositiveIntegerAndNegativeInteger {

    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < 0) {
                ++neg;
            } else if (nums[i] > 0) {
                pos = nums.length - i;
                break;
            }
        }
        return Math.max(neg, pos);
    }
}
