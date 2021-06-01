package com.examples.leetcode.hashtable_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/word-pattern/ */
public class L290WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        char[] order = pattern.toCharArray();
        String[] map = new String[26];
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < order.length; ++i) {
            int pos = order[i] - 'a';
            String word = words[i];
            if (map[pos] == null) {
                if (set.contains(word)) {
                    return false;
                }
                map[pos] = words[i];
                set.add(word);
            } else if (!map[pos].equals(word)) {
                return false;
            }
        }
        return true;
    }
}
