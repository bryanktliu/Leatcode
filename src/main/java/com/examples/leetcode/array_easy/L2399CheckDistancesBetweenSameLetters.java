package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/check-distances-between-same-letters/ */
public class L2399CheckDistancesBetweenSameLetters {

    public boolean checkDistances(String s, int[] distance) {
        int[] distances = new int[26];
        Arrays.fill(distances, -1);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            int pos = chars[i] - 'a';
            if (distances[pos] == -1) {
                distances[pos] = i;
            } else if (i - distances[pos] - 1 != distance[pos]) {
                return false;
            }
        }
        return true;
    }
}
