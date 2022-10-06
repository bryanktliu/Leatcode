package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/ */
public class L2335MinimumAmountOfTimeToFillCups {

    public int fillCups(int[] amount) {
        int average = (amount[0] + amount[1] + amount[2] + 1) / 2;
        int max = Math.max(Math.max(amount[0], amount[1]), amount[2]);
        return Math.max(average, max);
    }
}
