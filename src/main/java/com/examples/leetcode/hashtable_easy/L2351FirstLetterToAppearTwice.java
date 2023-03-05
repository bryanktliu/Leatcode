package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/first-letter-to-appear-twice/ */
public class L2351FirstLetterToAppearTwice {

    public char repeatedCharacter(String s) {
        boolean[] appear = new boolean[26];
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            int c = s.charAt(i) - 'a';
            if (appear[c]) {
                return (char) (c + 'a');
            }
            appear[c] = true;
        }
        return 'a';
    }
}
