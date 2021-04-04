package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/ */
public class L1013PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        total /= 3;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
            if (sum == total) {
                sum = 0;
                if (++count == 2 && i < arr.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
