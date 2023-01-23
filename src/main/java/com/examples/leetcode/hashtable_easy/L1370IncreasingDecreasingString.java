package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/increasing-decreasing-string/ */
public class L1370IncreasingDecreasingString {

    public String sortString(String s) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            ++chars[c - 'a'];
        }
        int count = s.length();
        StringBuilder res = new StringBuilder();
        while (count > 0) {
            for (int i = 0; i < 26; ++i) {
                if (chars[i] > 0) {
                    res.append((char) (i + 'a'));
                    --chars[i];
                    --count;
                }
            }
            for (int i = 25; i >= 0; --i) {
                if (chars[i] > 0) {
                    res.append((char) (i + 'a'));
                    --chars[i];
                    --count;
                }
            }
        }
        return res.toString();
    }
}
