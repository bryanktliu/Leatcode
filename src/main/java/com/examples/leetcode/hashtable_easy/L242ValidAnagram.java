package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/valid-anagram/ */
public class L242ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (char schar : s.toCharArray()) {
            ++count[schar - 'a'];
        }
        for (char tchar : t.toCharArray()) {
            if (--count[tchar - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
