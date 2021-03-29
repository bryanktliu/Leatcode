package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/ */
public class L1431KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> greatestCandies(int[] candies, int extra) {
        int max = 0;
        for (int count : candies) {
            max = Math.max(max, count);
        }
        List<Boolean> dist = new ArrayList<>(candies.length);
        for (int count : candies) {
            dist.add(count + extra >= max);
        }
        return dist;
    }
}
