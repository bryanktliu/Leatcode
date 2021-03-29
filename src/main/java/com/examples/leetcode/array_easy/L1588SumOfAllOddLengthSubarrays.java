package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sum-of-all-odd-length-subarrays/ */
public class L1588SumOfAllOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            int count = ((i + 1) * (arr.length - i) + 1) / 2;
            sum += count * arr[i];
        }
        return sum;
    }
}
