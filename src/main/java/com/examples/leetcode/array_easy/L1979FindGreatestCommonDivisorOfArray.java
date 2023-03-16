package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-greatest-common-divisor-of-array/ */
public class L1979FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        for (int i = min; i > 1; --i) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
