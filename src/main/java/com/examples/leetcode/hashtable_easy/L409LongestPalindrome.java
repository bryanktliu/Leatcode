package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/longest-palindrome/ */
public class L409LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] counts = new int[58];
        for (char c : s.toCharArray()) {
            ++counts[c - 'A'];
        }
        boolean single = false;
        int len = 0;
        for (int count : counts) {
            if (count % 2 == 1) {
                single = true;
            }
            len += count / 2 * 2;
        }
        if (single) {
            return len + 1;
        }
        return len;
    }
}
