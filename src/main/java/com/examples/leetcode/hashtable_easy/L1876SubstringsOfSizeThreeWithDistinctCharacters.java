package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/ */
public class L1876SubstringsOfSizeThreeWithDistinctCharacters {

    public int countGoodSubstrings(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 2; i < chars.length; ++i) {
            if (chars[i] != chars[i - 1]
                    && chars[i] != chars[i - 2]
                    && chars[i - 1] != chars[i - 2]) {
                ++count;
            }
        }
        return count;
    }
}
