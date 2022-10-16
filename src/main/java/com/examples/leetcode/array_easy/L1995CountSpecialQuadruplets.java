package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-special-quadruplets/ */
public class L1995CountSpecialQuadruplets {

    public int countQuadruplets(int[] nums) {
        int[] pairSums = new int[100];
        int count = 0;
        for (int i = 1; i < nums.length - 2; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] + nums[j] < 100) {
                    ++pairSums[nums[i] + nums[j]];
                }
            }
            for (int j = i + 2; j < nums.length; ++j) {
                if (nums[j] - nums[i + 1] > 1) {
                    count += pairSums[nums[j] - nums[i + 1]];
                }
            }
        }
        return count;
    }
}
