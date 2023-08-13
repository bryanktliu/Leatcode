package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/string-matching-in-an-array/ */
public class L1408StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; ++i) {
            if (match(words, i)) {
                res.add(words[i]);
            }
        }
        return res;
    }

    public boolean match(String[] words, int i) {
        for (int j = 0; j < words.length; ++j) {
            if (j != i && words[j].contains(words[i])) {
                return true;
            }
        }
        return false;
    }
}
