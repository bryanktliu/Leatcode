package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/ */
public class L1790CheckIfOneStringSwapCanMakeStringsEqual {

    public boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();
        int[] dif = new int[26];
        int count = 0;
        for (int i = 0; i < len; ++i) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                ++count;
            }
            if (count > 2) {
                return false;
            }
            ++dif[c1 - 'a'];
            --dif[c2 - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if (dif[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
