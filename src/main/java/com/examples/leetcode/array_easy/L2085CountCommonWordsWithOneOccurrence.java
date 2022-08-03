package com.examples.leetcode.array_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/count-common-words-with-one-occurrence/ */
public class L2085CountCommonWordsWithOneOccurrence {

    public int countWords(String[] words1, String[] words2) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> out = new HashSet<>();
        for (String s : words1) {
            if (set.contains(s)) {
                out.add(s);
            } else {
                set.add(s);
            }
        }
        HashSet<String> added = new HashSet<>();
        int count = 0;
        for (String s : words2) {
            if (added.contains(s) && !out.contains(s)) {
                --count;
                out.add(s);
            } else if (set.contains(s) && !out.contains(s)) {
                ++count;
                added.add(s);
            }
        }
        return count;
    }
}
