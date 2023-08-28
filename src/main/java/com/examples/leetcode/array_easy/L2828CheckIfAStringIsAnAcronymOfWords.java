package com.examples.leetcode.array_easy;

import java.util.List;

/** https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/ */
public class L2828CheckIfAStringIsAnAcronymOfWords {

    public boolean isAcronym(List<String> words, String s) {
        int len = words.size();
        if (s.length() != len) {
            return false;
        }
        for (int i = 0; i < len; ++i) {
            if (s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
