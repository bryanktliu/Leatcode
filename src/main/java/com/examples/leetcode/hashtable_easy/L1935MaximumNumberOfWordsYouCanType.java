package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/maximum-number-of-words-you-can-type/ */
public class L1935MaximumNumberOfWordsYouCanType {

    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] letters = new boolean[26];
        int len = brokenLetters.length();
        for (int i = 0; i < len; ++i) {
            letters[brokenLetters.charAt(i) - 'a'] = true;
        }
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            int length = word.length();
            boolean typeable = true;
            for (int i = 0; i < length; ++i) {
                if (letters[word.charAt(i) - 'a']) {
                    typeable = false;
                    break;
                }
            }
            if (typeable) {
                ++count;
            }
        }
        return count;
    }
}
