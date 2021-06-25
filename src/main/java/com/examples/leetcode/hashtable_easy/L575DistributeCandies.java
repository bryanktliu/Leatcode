package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/distribute-candies/ */
public class L575DistributeCandies {

    public int distributeCandies(int[] candyType) {
        boolean[] types = new boolean[200001];
        int count = 0;
        for (int type : candyType) {
            if (!types[type + 100000]) {
                if (++count == candyType.length / 2) {
                    return candyType.length / 2;
                }
                types[type + 100000] = true;
            }
        }
        return count;
    }
}
