package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/ */
public class L1941CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            ++count[s.charAt(i) - 'a'];
        }
        int last = 0;
        for (int i = 0; i < 26; ++i) {
            if (count[i] != last && count[i] != 0) {
                if (last == 0) {
                    last = count[i];
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
