package com.examples.leetcode.hashtable_easy;


/** https://leetcode.com/problems/verifying-an-alien-dictionary/ */
public class L953VerifyingAnAlienDictionary {

    int[] dict = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); ++i) {
            dict[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; ++i) {
            if (!findOrder(words[i - 1], words[i], 0)) {
                return false;
            }
        }
        return true;
    }

    public boolean findOrder(String word1, String word2, int index) {
        if (index == word1.length()) {
            return true;
        }
        if (index == word2.length()) {
            return false;
        }
        int word1pos = dict[word1.charAt(index) - 'a'];
        int word2pos = dict[word2.charAt(index) - 'a'];
        if (word1pos < word2pos) {
            return true;
        } else if (word1pos > word2pos) {
            return false;
        }
        return findOrder(word1, word2, index + 1);
    }
}
