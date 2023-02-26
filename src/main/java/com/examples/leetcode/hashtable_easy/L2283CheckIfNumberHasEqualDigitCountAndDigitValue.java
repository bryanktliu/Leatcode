package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/ */
public class L2283CheckIfNumberHasEqualDigitCountAndDigitValue {

    public boolean digitCount(String num) {
        int len = num.length();
        int[] counts = new int[10];
        for (int i = 0; i < len; i++) {
            ++counts[num.charAt(i) - '0'];
        }
        for (int i = 0; i < len; ++i) {
            if (counts[i] != num.charAt(i) - '0') {
                return false;
            }
        }
        return true;
    }
}
