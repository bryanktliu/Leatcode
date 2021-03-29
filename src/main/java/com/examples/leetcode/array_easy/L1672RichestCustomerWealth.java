package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/richest-customer-wealth/ */
public class L1672RichestCustomerWealth {

    public int richestCustomer(int[][] accounts) {
        int richest = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int bank : account) {
                wealth += bank;
            }
            richest = Math.max(richest, wealth);
        }
        return richest;
    }
}
