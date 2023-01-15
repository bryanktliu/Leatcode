package com.examples.leetcode.array_easy;

public class L2441LargestPositiveIntegerThatExistsWithItsNegative {

    public int findMaxK(int[] nums) {
        int max = -1;
        boolean[] seen = new boolean[2001];
        for (int num : nums) {
            if (seen[-num + 1000]) {
                max = Math.max(max, Math.abs(num));
            }
            seen[num + 1000] = true;
        }
        return max;
    }
}
