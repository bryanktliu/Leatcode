package com.examples.leetcode.array_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/find-subarrays-with-equal-sum/ */
public class L2395FindSubarraysWithEqualSum {

    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> sums = new HashSet<>();
        for (int i = 1; i < nums.length; ++i) {
            int sum = nums[i] + nums[i - 1];
            if (sums.contains(sum)) {
                return true;
            }
            sums.add(sum);
        }
        return false;
    }
}
