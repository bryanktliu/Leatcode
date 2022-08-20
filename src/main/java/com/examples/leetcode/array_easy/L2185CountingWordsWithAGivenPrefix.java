package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/counting-words-with-a-given-prefix/ */
public class L2185CountingWordsWithAGivenPrefix {

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                ++count;
            }
        }
        return count;
    }
}
