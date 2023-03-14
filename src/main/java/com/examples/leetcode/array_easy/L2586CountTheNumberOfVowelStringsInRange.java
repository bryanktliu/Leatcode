package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/ */
public class L2586CountTheNumberOfVowelStringsInRange {

    public int vowelStrings(String[] words, int left, int right) {
        ++right;
        int count = 0;
        for (int i = left; i < right; ++i) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                ++count;
            }
        }
        return count;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
