package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/isomorphic-strings/ */
public class L205IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] map = new int[256];
        boolean[] set = new boolean[256];
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        for (int i = 0; i < schars.length; ++i) {
            char schar = schars[i];
            char tchar = tchars[i];
            if (map[schar] == 0) {
                if (set[tchar]) {
                    return false;
                }
                map[schar] = tchar;
                set[tchar] = true;
            } else if (tchar != map[schar]) {
                return false;
            }
        }
        return true;
    }
}
