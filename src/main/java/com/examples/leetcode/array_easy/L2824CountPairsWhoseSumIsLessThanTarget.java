package com.examples.leetcode.array_easy;

import java.util.List;

/** https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/ */
public class L2824CountPairsWhoseSumIsLessThanTarget {

    public int countPairs(List<Integer> nums, int target) {
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); ++i) {
            arr[i] = nums.get(i);
        }
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] + arr[j] < target) {
                    ++count;
                }
            }
        }
        return count;
    }
}
