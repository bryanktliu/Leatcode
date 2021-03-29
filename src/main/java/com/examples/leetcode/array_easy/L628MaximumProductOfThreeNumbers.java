package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-product-of-three-numbers/ */
public class L628MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        int[] counts = new int[2001];
        for (int i : nums) {
            ++counts[i + 1000];
        }
        for (int i = 1; i < 2001; ++i) {
            counts[i] += counts[i - 1];
        }
        int[] ints = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; --i) {
            ints[counts[nums[i] + 1000] - 1] = nums[i];
            --counts[nums[i] + 1000];
        }
        int value;
        if (ints[ints.length - 1] >= 0) {
            value = Math.max(ints[0] * ints[1], ints[ints.length - 3] * ints[ints.length - 2]);
        } else {
            value = Math.min(ints[0] * ints[1], ints[ints.length - 3] * ints[ints.length - 2]);
        }

        return value * ints[ints.length - 1];
    }
}
