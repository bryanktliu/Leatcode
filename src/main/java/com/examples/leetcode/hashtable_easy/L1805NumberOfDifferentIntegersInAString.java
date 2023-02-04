package com.examples.leetcode.hashtable_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/number-of-different-integers-in-a-string/ */
public class L1805NumberOfDifferentIntegersInAString {

    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        int start = 0;
        int len = word.length();
        while (start < len) {
            if (word.charAt(start) <= '9') {
                int end = start;
                while (end < len && word.charAt(end) <= '9') {
                    ++end;
                }
                while (start < end && word.charAt(start) == '0') {
                    ++start;
                }
                set.add(word.substring(start, end));
                start = end;
            } else {
                ++start;
            }
        }
        return set.size();
    }
}
