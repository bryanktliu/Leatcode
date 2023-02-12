package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/ */
public class L2535DifferenceBetweenElementSumAndDigitSumOfAnArray {

    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sumDigit = 0;
        for (int num : nums) {
            sum += num;
            sumDigit += sumDigit(num);
        }
        return Math.abs(sum - sumDigit);
    }

    public int sumDigit(int num) {
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        return sum + num;
    }
}
