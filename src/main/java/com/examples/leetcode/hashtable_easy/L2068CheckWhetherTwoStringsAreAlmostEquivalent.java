package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/ */
public class L2068CheckWhetherTwoStringsAreAlmostEquivalent {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count = new int[26];
        int len = word1.length();
        for (int i = 0; i < len; ++i) {
            ++count[word1.charAt(i) - 'a'];
        }
        len = word2.length();
        for (int i = 0; i < len; ++i) {
            --count[word2.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if (count[i] > 3 || count[i] < -3) {
                return false;
            }
        }
        return true;
    }
}
