package com.examples.leetcode.array_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/find-maximum-number-of-string-pairs/ */
public class L2744FindMaximumNumberOfStringPairs {

    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> strings = new HashSet<>();
        int count = 0;
        for (int i = 0; i < words.length - 1; ++i) {
            for (int j = i + 1; j < words.length; ++j) {
                if (words[i].charAt(0) == words[j].charAt(1)
                        && words[i].charAt(1) == words[j].charAt(0)) {
                    ++count;
                }
            }
        }
        return count;
    }
}
