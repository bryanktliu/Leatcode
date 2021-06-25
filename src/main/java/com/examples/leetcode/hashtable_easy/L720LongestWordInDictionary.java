package com.examples.leetcode.hashtable_easy;

import java.util.*;

/** https://leetcode.com/problems/longest-word-in-dictionary/ */
public class L720LongestWordInDictionary {

    HashMap<String, Boolean> visited = new HashMap<>();
    HashSet<String> set = new HashSet<>();

    public String longestWord(String[] words) {
        Collections.addAll(set, words);
        List<String> results = new ArrayList<>();
        for (String word : words) {
            if (check(word)) {
                results.add(word);
            }
        }
        int size = results.size();
        if (size == 0) {
            return "";
        }
        int index = -1;
        int length = 0;
        for (int i = 0; i < size; ++i) {
            int len = results.get(i).length();
            if (len > length) {
                index = i;
                length = len;
            } else if (len == length) {
                if (results.get(i).compareTo(results.get(index)) < 0) {
                    index = i;
                    length = len;
                }
            }
        }

        return results.get(index);
    }

    public boolean check(String word) {
        if (word.length() == 0) {
            return true;
        }
        if (visited.containsKey(word)) {
            return visited.get(word);
        }
        if (!set.contains(word)) {
            visited.put(word, false);
            return false;
        }
        boolean check = check(word.substring(0, word.length() - 1));
        visited.put(word, check);
        return check;
    }
}
