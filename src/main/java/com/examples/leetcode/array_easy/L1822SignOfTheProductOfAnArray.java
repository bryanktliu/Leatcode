package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sign-of-the-product-of-an-array/ */
public class L1822SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num < 0) {
                ++count;
            } else if (num == 0) {
                return 0;
            }
        }
        if (count % 2 == 0) {
            return 1;
        }
        return -1;
    }
}
