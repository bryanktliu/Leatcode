package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/ */
public class L1464MaximumProductOfTwoElements {

    public int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;
        for (int i : nums) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second) {
                second = i;
            }
        }
        return (first - 1) * (second - 1);
    }
}
