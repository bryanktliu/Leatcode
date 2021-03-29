package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */
public class L121BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = prices[0];
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] < start) {
                start = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - start);
            }
        }
        return profit;
    }
}
