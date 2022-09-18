package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/best-poker-hand/ */
public class L2347BestPokerHand {

    public String bestHand(int[] ranks, char[] suits) {
        boolean flush = true;
        for (int i = 1; i < suits.length; ++i) {
            if (suits[i] != suits[i - 1]) {
                flush = false;
                break;
            }
        }
        if (flush) {
            return "Flush";
        }
        int[] count = new int[14];
        for (int rank : ranks) {
            ++count[rank];
        }
        int max = 0;
        for (int c : count) {
            max = Math.max(c, max);
        }
        if (max == 1) {
            return "High Card";
        } else if (max == 2) {
            return "Pair";
        }
        return "Three of a Kind";
    }
}
