package com.examples.leetcode.array_easy;

import java.util.List;

/** https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/ */
public class L2859SumOfValuesAtIndicesWithKSetBits {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int len = nums.size();
        int sum = 0;
        for (int i = 0; i < len; ++i) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
