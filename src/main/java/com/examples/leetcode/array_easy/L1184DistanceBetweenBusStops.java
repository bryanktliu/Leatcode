package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/distance-between-bus-stops */
public class L1184DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int tmp = 0;
        for (int i = 0; i < distance.length; ++i) {
            total += distance[i];
            if ((i >= start && i < destination) || (i >= destination && i < start)) {
                tmp += distance[i];
            }
        }
        return Math.min(total - tmp, tmp);
    }
}
