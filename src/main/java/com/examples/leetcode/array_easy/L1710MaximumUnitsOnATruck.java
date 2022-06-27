package com.examples.leetcode.array_easy;

/**
 * https://leetcode.com/problems/maximum-units-on-a-truck/
 */
public class L1710MaximumUnitsOnATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] map = new int[1001];
        for (int[] boxType : boxTypes) {
            map[boxType[1]] += boxType[0];
        }
        int units = 0;
        for (int i = 1000; i >= 0; --i) {
            if (map[i] != 0) {
                if (truckSize - map[i] <= 0) {
                    units += i * truckSize;
                    break;
                } else {
                    units += i * map[i];
                    truckSize -= map[i];
                }
            }
        }
        return units;
    }
}
