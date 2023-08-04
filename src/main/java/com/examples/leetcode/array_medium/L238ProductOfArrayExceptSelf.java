package com.examples.leetcode.array_medium;

import java.util.Arrays;

/** https://leetcode.com/problems/product-of-array-except-self/description/ */
public class L238ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        for (int i = 1; i < nums.length; ++i) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
