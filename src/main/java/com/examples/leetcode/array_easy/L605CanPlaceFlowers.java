package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/can-place-flowers/ */
public class L605CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        boolean previous = true;
        int count = 0;
        for (int i = 0; i < flowerbed.length - 1; ++i) {
            if (flowerbed[i] == 0) {
                if (flowerbed[i + 1] == 0) {
                    if (previous) {
                        ++count;
                        if (count >= n) {
                            return true;
                        }
                    }
                    previous = !previous;
                } else {
                    previous = false;
                    ++i;
                }
            } else {
                previous = false;
            }
        }
        if (previous && flowerbed[flowerbed.length - 1] == 0) {
            ++count;
        }
        return count >= n;
    }
}
