package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/largest-substring-between-two-equal-characters/ */
public class L1624LargestSubstringBetweenTwoEqualCharacters {

    public int maxLengthBetweenEqualCharacters(String s) {
        int[] start = new int[26];
        for (int i = 0; i < 26; ++i) {
            start[i] = -1;
        }
        int max = -1;
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            int c = s.charAt(i) - 'a';
            if (start[c] != -1) {
                max = Math.max(i - start[c] - 1, max);
            } else {
                start[c] = i;
            }
        }
        return max;
    }
}
