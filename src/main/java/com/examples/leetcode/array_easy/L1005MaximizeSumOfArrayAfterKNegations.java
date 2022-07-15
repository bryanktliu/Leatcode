package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/ */
public class L1005MaximizeSumOfArrayAfterKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int index = 0;
        while (k > 0 && index < nums.length) {
            if (nums[index] < 0) {
                --k;
                sum -= nums[index];
            } else if (nums[index] > 0) {
                if (k == 1) {
                    sum -= nums[index];
                } else {
                    sum += nums[index];
                }
                k = 0;
            } else {
                k = 0;
            }
            ++index;
        }
        for (int i = index; i < nums.length; ++i) {
            sum += nums[i];
        }
        return sum;
    }
}
