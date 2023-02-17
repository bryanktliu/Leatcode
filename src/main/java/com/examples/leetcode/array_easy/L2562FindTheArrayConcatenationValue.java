package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-array-concatenation-value/ */
public class L2562FindTheArrayConcatenationValue {

    public long findTheArrayConcVal(int[] nums) {
        long total = 0;
        int mid = (nums.length) / 2;
        if (nums.length % 2 == 1) {
            total += nums[mid];
        }
        for (int i = 0; i < mid; ++i) {
            int end = nums[nums.length - i - 1];
            if (end < 10) {
                total += nums[i] * 10L + end;
            } else if (end < 100) {
                total += nums[i] * 100L + end;
            } else if (end < 1000) {
                total += nums[i] * 1000L + end;
            } else if (end < 10000) {
                total += nums[i] * 10000L + end;
            } else if (end < 100000) {
                total += nums[i] * 100000L + end;
            }
        }
        return total;
    }
}
