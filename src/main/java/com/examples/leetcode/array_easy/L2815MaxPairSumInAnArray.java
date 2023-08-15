package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/max-pair-sum-in-an-array/ */
public class L2815MaxPairSumInAnArray {

    public int maxSum(int[] nums) {
        int[] greatest = new int[10];
        int max = -1;
        for (int num : nums) {
            int digit = greatestDigit(num);
            if (greatest[digit] != 0) {
                max = Math.max(max, greatest[digit] + num);
            }
            greatest[digit] = Math.max(greatest[digit], num);
        }
        return max;
    }

    public int greatestDigit(int num) {
        int max = 0;
        while (num > 9) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return Math.max(max, num);
    }
}
