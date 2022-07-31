package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/ */
public class L1961CheckIfStringIsAPrefixOfArray {

    public boolean isPrefixString(String s, String[] words) {
        int len = s.length();
        int j = 0;
        for (String word : words) {
            int length = word.length();
            for (int k = 0; k < length; ++k, ++j) {
                if (j >= len || word.charAt(k) != s.charAt(j)) {
                    return false;
                }
            }
            if (j == len) {
                return true;
            }
        }
        return false;
    }
}
