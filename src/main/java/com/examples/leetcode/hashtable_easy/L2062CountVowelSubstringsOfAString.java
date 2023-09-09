package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/count-vowel-substrings-of-a-string/ */
public class L2062CountVowelSubstringsOfAString {

    public int countVowelSubstrings(String word) {
        char[] chars = word.toCharArray();
        int count = 0;
        int[] counts = new int[26];
        for (int i = 0; i < chars.length - 4; ++i) {
            int vowels = 0;
            for (int j = i; j < chars.length; ++j) {
                if (counts[chars[j] - 'a'] == -1) {
                    ++vowels;
                    counts[chars[j] - 'a'] = 1;
                } else if (counts[chars[j] - 'a'] == 0) {
                    break;
                }
                if (vowels == 5) {
                    ++count;
                }
            }
            resetVowels(counts);
        }
        return count;
    }

    public void resetVowels(int[] counts) {
        counts['a' - 'a'] = -1;
        counts['e' - 'a'] = -1;
        counts['i' - 'a'] = -1;
        counts['o' - 'a'] = -1;
        counts['u' - 'a'] = -1;
    }
}
