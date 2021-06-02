package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/find-the-difference/ */
public class L389FindTheDifference {

    public char findTheDifference(String s, String t) {
        int val = 0;
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        for (int i = 0; i < ta.length; ++i) {
            val = val ^ ta[i];
            if (i < sa.length) {
                val = val ^ sa[i];
            }
        }
        return (char) val;
    }
}
