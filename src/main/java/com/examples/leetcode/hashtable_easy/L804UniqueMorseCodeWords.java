package com.examples.leetcode.hashtable_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/unique-morse-code-words/ */
public class L804UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
        HashSet<String> seen = new HashSet<>();
        for (String word : words) {
            StringBuilder current = new StringBuilder();
            for (int j = 0; j < word.length(); ++j) {
                current.append(morse[word.charAt(j) - 'a']);
            }
            seen.add(current.toString());
        }
        return seen.size();
    }
}
