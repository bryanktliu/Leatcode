package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/divide-array-into-equal-pairs/ */
public class L2206DivideArrayIntoEqualPairs {

    public boolean divideArray(int[] nums) {
        int[] count = new int[501];
        for (int num : nums) {
            ++count[num];
        }
        for (int i : count) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
