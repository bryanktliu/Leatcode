package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/count-vowel-substrings-of-a-string/ */
public class L2062CountVowelSubstringsOfAString {

    public int countVowelSubstrings2(String word) {
        int len = word.length();
        int count = 0;
        int[] counts = new int[26];
        resetVowels(counts);
        int vowels = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < len; ++i) {
            int c = word.charAt(i) - 'a';
            if (counts[c] == 0) {
                start = i + 1;
                end = start;
                vowels = 0;
                resetVowels(counts);
            } else {
                ++counts[c];
                if (counts[c] == 2) {
                    ++vowels;
                }
                while (vowels == 5) {
                    c = word.charAt(end) - 'a';
                    if (counts[c] == 2) {
                        --vowels;
                    }
                    --counts[c];
                    ++end;
                }
                count += end - start;
            }
        }
        return count;
    }

    public void resetVowels(int[] counts) {
        counts['a' - 'a'] = 1;
        counts['e' - 'a'] = 1;
        counts['i' - 'a'] = 1;
        counts['o' - 'a'] = 1;
        counts['u' - 'a'] = 1;
    }
}
