package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/ */
public class L2114MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            max = Math.max(countWords(sentence), max);
        }
        return max;
    }

    public int countWords(String s) {
        int words = 1;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                ++words;
            }
        }
        return words;
    }
}
