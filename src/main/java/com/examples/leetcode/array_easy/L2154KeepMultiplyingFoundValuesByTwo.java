package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/keep-multiplying-found-values-by-two/ */
public class L2154KeepMultiplyingFoundValuesByTwo {

    public int findFinalValue(int[] nums, int original) {
        boolean[] found = new boolean[1001];
        for (int num : nums) {
            found[num] = true;
        }
        while (original < 1001) {
            if (found[original]) {
                original *= 2;
            } else {
                break;
            }
        }
        return original;
    }
}
