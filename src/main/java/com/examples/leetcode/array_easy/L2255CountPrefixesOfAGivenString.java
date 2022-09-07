package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-prefixes-of-a-given-string/ */
public class L2255CountPrefixesOfAGivenString {

    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                ++count;
            }
        }
        return count;
    }
}
