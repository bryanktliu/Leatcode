package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/buy-two-chocolates/ */
public class L2706BuyTwoChocolates {

    public int buyChoco(int[] prices, int money) {
        int min1 = 100;
        int min2 = 100;
        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }
        int leftover = money - min1 - min2;
        if (leftover < 0) {
            return money;
        }
        return leftover;
    }
}
