package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/ */
public class L1502CanMakeArithmeticProgression {

    @SuppressWarnings("PMD")
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        int diff = max - min;
        int gap = diff / (arr.length - 1);
        if (diff != gap * (arr.length - 1)) {
            return false;
        }
        for (int i = 0; i < arr.length; ++i) {
            int pos = (arr[i] - min) / gap;
            if (arr[pos] == arr[i]) {
                return false;
            }
            arr[pos] = arr[i];
        }
        return true;
    }
}
