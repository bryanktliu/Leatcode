package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/ */
public class L2511MaximumEnemyFortsThatCanBeCaptured {

    public int captureForts(int[] forts) {
        int max = 0;
        int last = -1;
        for (int i = 0; i < forts.length; ++i) {
            if (forts[i] != 0) {
                if (last != -1 && forts[last] != forts[i]) {
                    max = Math.max(max, i - last - 1);
                }
                last = i;
            }
        }
        return max;
    }
}
