package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/ */
public class L2309GreatestEnglishLetterInUpperAndLowerCase {

    public String greatestLetter(String s) {
        for (char i = 'Z'; i >= 'A'; --i) {
            if (s.indexOf(i) != -1 && s.indexOf((char) (i + 32)) != -1) {
                return String.valueOf(i);
            }
        }
        return "";
    }
}
