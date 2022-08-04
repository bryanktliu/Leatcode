package com.examples.leetcode.array_easy;

/** 　https://leetcode.com/problems/time-needed-to-buy-tickets/　 */
public class L2073TimeNeededToBuyTickets {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int i = 0; i <= k; ++i) {
            time += Math.min(tickets[i], tickets[k]);
        }
        for (int i = k + 1; i < tickets.length; ++i) {
            time += Math.min(tickets[i], tickets[k] - 1);
        }
        return time;
    }
}
