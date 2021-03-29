package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/array-partition-i/ */
public class L561ArrayPartition {

    public int arrayPairSum(int[] nums) {
        int[] counts = new int[20001];
        for (int i : nums) {
            ++counts[i + 10000];
        }
        int sum = 0;
        boolean even = true;
        for (int i = 0; i < counts.length; ++i) {
            if (counts[i] > 0) {
                if (counts[i] % 2 == 0) {
                    sum += (counts[i] / 2) * (i - 10000);
                } else {
                    if (even) {
                        sum += (counts[i] / 2 + 1) * (i - 10000);
                    } else {
                        sum += (counts[i] / 2) * (i - 10000);
                    }
                    even = !even;
                }
            }
        }
        return sum;
    }
}
