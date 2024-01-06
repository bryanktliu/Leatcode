package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/minimum-number-game/ */
public class L2974MinimumNumberGame {

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}
