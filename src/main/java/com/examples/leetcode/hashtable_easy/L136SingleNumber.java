package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/single-number/ */
public class L136SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
