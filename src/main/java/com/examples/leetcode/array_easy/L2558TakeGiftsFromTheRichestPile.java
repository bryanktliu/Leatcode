package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/take-gifts-from-the-richest-pile/ */
public class L2558TakeGiftsFromTheRichestPile {

    public long pickGifts(int[] gifts, int k) {
        while (k > 0) {
            Arrays.sort(gifts);
            int sqrt = (int) Math.sqrt(gifts[gifts.length - 1]);
            for (int i = gifts.length - 1; i >= 0 && k > 0; --i) {
                if (gifts[i] >= sqrt) {
                    gifts[i] = (int) Math.sqrt(gifts[i]);
                    --k;
                } else {
                    break;
                }
            }
        }
        long total = 0;
        for (int g : gifts) {
            total += g;
        }
        return total;
    }
}
