package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/kth-missing-positive-number */
public class L1539KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        int missing = arr[0] - 1;
        if (missing >= k) {
            return k;
        }

        for (int i = 1; i < arr.length; ++i) {
            int diff = arr[i] - arr[i - 1] - 1;
            if (diff > 0) {
                if ((missing + diff) >= k) {
                    return arr[i - 1] + k - missing;
                }
                missing += diff;
            }
        }
        return arr[arr.length - 1] + k - missing;
    }
}
