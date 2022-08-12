package com.examples.leetcode.array_easy;

public class L2144MinimumCostOfBuyingCandiesWithDiscount {

    public int minimumCost(int[] cost) {
        int[] count = new int[101];
        for (int i : cost) {
            ++count[i];
        }
        int total = 0;
        int i = 100;
        int j = 0;
        while (i > 0) {
            if (count[i] > 0) {
                --count[i];
                if (j == 2) {
                    j = 0;
                } else {
                    ++j;
                    total += i;
                }
            } else {
                --i;
            }
        }
        return total;
    }
}
