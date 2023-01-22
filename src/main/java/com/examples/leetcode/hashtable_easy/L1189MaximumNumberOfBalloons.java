package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/maximum-number-of-balloons/ */
public class L1189MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        for (char c : text.toCharArray()) {
            ++chars[c - 'a'];
        }
        return Math.min(
                Math.min(Math.min(Math.min(chars[1], chars[0]), chars[11] / 2), chars[14] / 2),
                chars[13]);
    }
}
