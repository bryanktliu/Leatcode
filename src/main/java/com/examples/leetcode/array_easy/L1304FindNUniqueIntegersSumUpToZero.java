package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/ */
public class L1304FindNUniqueIntegersSumUpToZero {

    @SuppressWarnings("PMD")
    public int[] sumZero(int n) {
        int[] ret = new int[n];
        for (int i = 0, size = n - 1; i < size; ++i) {
            ret[i] = i;
        }
        ret[n - 1] = (1 - n) * (n - 2) / 2;
        return ret;
    }
}
