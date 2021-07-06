package com.examples.leetcode.hashtable_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/** https://leetcode.com/problems/most-common-word/ */
public class L819MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> words = new HashMap<>();
        HashSet<String> ban = new HashSet<>(Arrays.asList(banned));
        StringBuilder word = new StringBuilder();
        int max = 0;
        String maxword = "";
        for (char c : paragraph.toCharArray()) {
            if (c <= 'z' && c >= 'a') {
                word.append(c);
            } else if (c <= 'Z' && c >= 'A') {
                word.append((char) (c + ' '));
            } else {
                if (word.length() != 0 && !ban.contains(word.toString())) {
                    String current = word.toString();
                    int count = words.getOrDefault(current, 0);
                    words.put(current, ++count);
                    if (count > max) {
                        max = count;
                        maxword = current;
                    }
                }
                word.setLength(0);
            }
        }
        if (word.length() != 0 && !ban.contains(word.toString())) {
            int count = words.getOrDefault(word.toString(), 0) + 1;
            if (count > max) {
                max = count;
                maxword = word.toString();
            }
        }
        return maxword;
    }
}
