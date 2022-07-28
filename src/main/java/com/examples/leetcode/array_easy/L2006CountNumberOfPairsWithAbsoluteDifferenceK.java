package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/ */
public class L2006CountNumberOfPairsWithAbsoluteDifferenceK {

    public int countKDifference(int[] nums, int k) {
        int[] counter = new int[101];
        for (int num : nums) {
            ++counter[num];
        }
        int res = 0;
        for (int i = k + 1; i < 101; ++i) {
            res += counter[i] * counter[i - k];
        }
        return res;
    }
}
