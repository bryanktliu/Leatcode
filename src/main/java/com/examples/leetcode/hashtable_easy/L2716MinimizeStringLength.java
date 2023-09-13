package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/minimize-string-length/ */
public class L2716MinimizeStringLength {

    public int minimizedStringLength(String s) {
        int len = s.length();
        boolean[] seen = new boolean[26];
        int count = 0;
        for (int i = 0; i < len; ++i) {
            int c = s.charAt(i) - 'a';
            if (!seen[c]) {
                ++count;
                seen[c] = true;
            }
        }
        return count;
    }
}
