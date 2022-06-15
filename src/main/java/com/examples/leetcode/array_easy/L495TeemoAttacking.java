package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/teemo-attacking/ */
public class L495TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = duration;
        for (int i = 1; i < timeSeries.length; ++i) {
            if (timeSeries[i - 1] + duration - 1 >= timeSeries[i]) {
                total += timeSeries[i] - timeSeries[i - 1];
            } else {
                total += duration;
            }
        }
        return total;
    }
}
