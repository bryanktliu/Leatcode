package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ */
public class L1295FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int length = (int) Math.log10(num);
            if (length % 2 != 0) {
                ++count;
            }
        }
        return count;
    }
}
