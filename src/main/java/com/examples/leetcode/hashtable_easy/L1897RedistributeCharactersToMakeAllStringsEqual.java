package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/ */
public class L1897RedistributeCharactersToMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {
        int length = 0;
        for (String word : words) {
            length += word.length();
        }
        if (length % words.length != 0) {
            return false;
        }
        int[] counts = new int[26];
        for (String word : words) {
            int len = word.length();
            for (int i = 0; i < len; ++i) {
                ++counts[word.charAt(i) - 'a'];
            }
        }
        for (int count : counts) {
            if (count % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
