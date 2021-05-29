package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-highest-altitude/ */
public class L1732FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int highest = 0;
        int current = 0;
        for (int value : gain) {
            current += value;
            if (current > highest) {
                highest = current;
            }
        }
        return highest;
    }
}
