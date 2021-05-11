package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-equivalent-domino-pairs/ */
public class L1128NumberOfEquivalentDominoPairs {

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];
        int total = 0;
        for (int[] domino : dominoes) {
            if (domino[0] > domino[1]) {
                ++counts[domino[1] * 10 + domino[0]];
            } else {
                ++counts[domino[0] * 10 + domino[1]];
            }
        }
        for (int count : counts) {
            total += count * (count - 1) / 2;
        }
        return total;
    }
}
