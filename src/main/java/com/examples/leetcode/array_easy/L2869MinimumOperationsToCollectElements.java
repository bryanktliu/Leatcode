package com.examples.leetcode.array_easy;

import java.util.List;

/** https://leetcode.com/problems/minimum-operations-to-collect-elements/ */
public class L2869MinimumOperationsToCollectElements {

    public int minOperations(List<Integer> nums, int k) {
        boolean[] seen = new boolean[k + 1];
        int count = 0;
        for (int i = nums.size() - 1; i >= 0; --i) {
            int n = nums.get(i);
            if (n <= k && !seen[n]) {
                ++count;
                if (count == k) {
                    return nums.size() - i;
                }
                seen[n] = true;
            }
        }
        return -1;
    }
}
