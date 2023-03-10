package com.examples.leetcode.hashtable_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/remove-letter-to-equalize-frequency/ */
public class L2423RemoveLetterToEqualizeFrequency {

    public boolean equalFrequency(String word) {
        int[] frequency = new int[26];
        Arrays.fill(frequency, -1);
        char[] chars = word.toCharArray();
        for (char c : chars) {
            ++frequency[c - 'a'];
        }
        for (char c : chars) {
            --frequency[c - 'a'];
            int last = -1;
            boolean equal = true;
            for (int i = 0; i < 26; ++i) {
                if (frequency[i] == -1) {
                    continue;
                }
                if (last == -1) {
                    last = frequency[i];
                    continue;
                }
                if (frequency[i] != last) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                return true;
            }
            ++frequency[c - 'a'];
        }
        return false;
    }
}
