package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/shortest-completing-word/ */
public class L748ShortestCompletingWord {

    int[] letters = new int[26];

    public String shortestCompletingWord(String licensePlate, String[] words) {
        char[] chars = licensePlate.toCharArray();
        for (char c : chars) {
            int index = c - 'A';
            if (index < 0) {
                continue;
            } else if (index > 25) {
                index -= 32;
            }
            ++letters[index];
        }
        int length = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < words.length; ++i) {
            if(check(words[i])) {
                int len = words[i].length();
                if(len < length) {
                    length = len;
                    index = i;
                }
            }
        }
        return words[index];
    }

    public boolean check(String word) {
        int[] temp = letters.clone();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            --temp[c - 'a'];
        }
        for (int value : temp) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }
}
