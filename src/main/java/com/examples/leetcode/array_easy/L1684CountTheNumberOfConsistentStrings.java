package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-the-number-of-consistent-strings/ */
public class L1684CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean[26];
        int len = allowed.length();
        for (int i = 0; i < len; ++i) {
            allow[allowed.charAt(i) - 'a'] = true;
        }
        int count = 0;
        for (String word : words) {
            boolean pass = true;
            int length = word.length();
            for (int j = 0; j < length; ++j) {
                if (!allow[word.charAt(j) - 'a']) {
                    pass = false;
                    break;
                }
            }
            if (pass) {
                ++count;
            }
        }
        return count;
    }
}
