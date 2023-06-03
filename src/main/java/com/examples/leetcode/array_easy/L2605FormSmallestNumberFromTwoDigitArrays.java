package com.examples.leetcode.array_easy;

/**
 * https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays/
 */
public class L2605FormSmallestNumberFromTwoDigitArrays {

    public int minNumber(int[] nums1, int[] nums2) {
        int[] count = new int[10];
        int min = 10;
        for (int num : nums1) {
            ++count[num];
            min = Math.min(min, num);
        }
        int min2 = 10;
        for (int num : nums2) {
            ++count[num];
            min2 = Math.min(min2, num);
        }
        for (int i = 0; i < count.length; ++i) {
            if (count[i] == 2) {
                return i;
            }
        }
        if (min < min2) {
            return min * 10 + min2;
        } else {
            return min2 * 10 + min;
        }
    }
}
