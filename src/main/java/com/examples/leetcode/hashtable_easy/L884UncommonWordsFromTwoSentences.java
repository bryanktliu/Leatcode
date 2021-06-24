package com.examples.leetcode.hashtable_easy;

import java.util.*;

/** https://leetcode.com/problems/uncommon-words-from-two-sentences/ */
public class L884UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        s1 += " ";
        s2 += " ";
        HashMap<String, Boolean> words = new HashMap<>();
        int lastspace = -1;
        int space = -1;
        for (int i = 0; i < s1.length(); ++i) {
            if(s1.charAt(i) == ' ') {
                lastspace = space;
                space = i;
                String word = s1.substring(lastspace + 1,space);
                words.put(word, !words.containsKey(word));
            }
        }
        lastspace = -1;
        space = -1;
        for (int i = 0; i < s2.length(); ++i) {
            if(s2.charAt(i) == ' ') {
                lastspace = space;
                space = i;
                String word = s2.substring(lastspace + 1,space);
                words.put(word, !words.containsKey(word));
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry: words.entrySet()) {
            if (entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < res.length; ++i) {
            res[i] = list.get(i);
        }
        return res;
    }
}
