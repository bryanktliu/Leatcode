package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii */
public class L122BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; ++i) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                profit += diff;
            }
        }
        return profit;
    }
}
