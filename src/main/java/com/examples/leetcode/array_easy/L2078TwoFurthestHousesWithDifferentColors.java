package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/two-furthest-houses-with-different-colors/ */
public class L2078TwoFurthestHousesWithDifferentColors {

    public int maxDistance(int[] colors) {
        int color = colors[colors.length - 1];
        int dif = 0;
        for (int i = 0; i < colors.length; ++i) {
            if (colors[i] != color) {
                dif = colors.length - 1 - i;
                break;
            }
        }
        color = colors[0];
        for (int i = colors.length - 1; i >= 0; --i) {
            if (colors[i] != color) {
                dif = Math.max(dif, i);
                break;
            }
        }
        return dif;
    }
}
