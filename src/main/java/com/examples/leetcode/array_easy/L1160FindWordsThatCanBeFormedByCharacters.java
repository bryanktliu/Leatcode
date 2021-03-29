package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/find-words-that-can-be-formed-by-characters */
public class L1160FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {
        int[] base = new int[26];
        for (char c : chars.toCharArray()) {
            ++base[c - 'a'];
        }

        int sum = 0;
        int length = chars.length();
        for (String word : words) {
            if (word.length() > length) {
                continue;
            }
            int[] copy = Arrays.copyOf(base, 26);
            boolean match = true;
            for (char c : word.toCharArray()) {
                if (--copy[c - 'a'] < 0) {
                    match = false;
                    break;
                }
            }
            if (match) {
                sum += word.length();
            }
        }
        return sum;
    }
}
