package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-smallest-letter-greater-than-target/ */
public class L744FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }
}
