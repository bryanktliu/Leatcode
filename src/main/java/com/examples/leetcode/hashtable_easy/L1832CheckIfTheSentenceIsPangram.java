package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/check-if-the-sentence-is-pangram/ */
public class L1832CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        for (char c = 'a'; c <= 'z'; ++c) {
            if (!sentence.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
