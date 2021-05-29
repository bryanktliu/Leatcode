package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/ */
public class L1758MinimumChangesToMakeAlternatingBinaryString {

    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int zerochange = 0;
        int onechange = 0;
        for (int i = 0; i < chars.length; i += 2) {
            if (chars[i] == '1') {
                ++zerochange;
            } else {
                ++onechange;
            }
        }
        for (int i = 0; i < chars.length; i += 2) {
            if (chars[i] == '0') {
                ++zerochange;
            } else {
                ++onechange;
            }
        }
        return Math.min(zerochange, onechange);
    }
}
