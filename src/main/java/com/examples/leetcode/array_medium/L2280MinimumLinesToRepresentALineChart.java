package com.examples.leetcode.array_medium;

import java.util.Arrays;
import java.util.Comparator;

/** https://leetcode.com/problems/minimum-lines-to-represent-a-line-chart/ */
public class L2280MinimumLinesToRepresentALineChart {

    public int minimumLines(int[][] stockPrices) {
        if (stockPrices.length <= 2) {
            return stockPrices.length - 1;
        }
        Arrays.sort(stockPrices, Comparator.comparingInt(a -> a[0]));
        int lastX = stockPrices[0][0] - stockPrices[1][0];
        int lastY = stockPrices[0][1] - stockPrices[1][1];
        int count = 1;
        for (int i = 2; i < stockPrices.length; ++i) {
            int x = stockPrices[i - 1][0] - stockPrices[i][0];
            int y = stockPrices[i - 1][1] - stockPrices[i][1];
            if (x * lastY != y * lastX) {
                lastY = y;
                lastX = x;
                ++count;
            }
        }
        return count;
    }
}
