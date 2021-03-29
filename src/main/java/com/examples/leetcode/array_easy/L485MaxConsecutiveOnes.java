package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/max-consecutive-ones/ */
public class L485MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i : nums) {
            if (i == 1) {
                max = Math.max(max, ++count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
