package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-arithmetic-triplets/ */
public class L2367NumberOfArithmeticTriplets {

    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] seen = new boolean[201];
        int count = 0;
        for (int num : nums) {
            seen[num] = true;
            if (num < diff * 2) {
                continue;
            }
            if (seen[num - diff] && seen[num - diff * 2]) {
                ++count;
            }
        }
        return count;
    }
}
