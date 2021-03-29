package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/can-place-flowers/ */
public class L605CanPlaceFlowers {

    @SuppressWarnings("PMD")
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 0) {
            return false;
        }

        boolean allowed = true;
        int count = 0;
        for (int i = 0; i < flowerbed.length - 1; ++i) {
            if (flowerbed[i] == 0) {
                if (flowerbed[i + 1] == 0) {
                    if (allowed) {
                        if (++count >= n) {
                            return true;
                        }
                    }
                    allowed = !allowed;
                } else {
                    allowed = false;
                    ++i;
                }
            } else {
                allowed = false;
            }
        }
        return allowed && flowerbed[flowerbed.length - 1] == 0 && ++count >= n;
    }
}
