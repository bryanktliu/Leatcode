package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/n-repeated-element-in-size-2n-array/ */
public class L961NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] nums) {
        boolean[] seen = new boolean[10001];
        for (int num : nums) {
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }
        return -1;
    }
}
