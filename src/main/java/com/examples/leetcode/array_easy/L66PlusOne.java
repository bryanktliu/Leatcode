package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/plus-one/ */
public class L66PlusOne {

    public int[] plusOne(int[] digits) {
        boolean carry = true;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (carry) {
                ++digits[i];
            }
            carry = digits[i] > 9;
            if (carry) {
                digits[i] -= 10;
            }
        }
        if (carry) {
            int[] ret = new int[digits.length + 1];
            ret[0] = 1;
            System.arraycopy(digits, 0, ret, 1, digits.length);
            return ret;
        }
        return digits;
    }
}
