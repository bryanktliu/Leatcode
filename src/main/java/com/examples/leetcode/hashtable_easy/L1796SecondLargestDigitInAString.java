package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/second-largest-digit-in-a-string/ */
public class L1796SecondLargestDigitInAString {

    public int secondHighest(String s) {
        char max = '/';
        char secondMax = '/';
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            if (c > '9') {
                continue;
            }
            if (c > max) {
                secondMax = max;
                max = c;
            } else if (c < max && c > secondMax) {
                secondMax = c;
            }
        }
        return secondMax - '0';
    }
}
