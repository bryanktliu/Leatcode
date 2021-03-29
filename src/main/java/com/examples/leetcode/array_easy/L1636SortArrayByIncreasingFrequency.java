package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/sort-array-by-increasing-frequency/ */
public class L1636SortArrayByIncreasingFrequency {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public int[] frequencySort(int[] nums) {
        int[] counts = new int[201];
        for (int i : nums) {
            ++counts[i + 100];
        }
        List<Integer>[] map = new List[nums.length + 1];
        for (int i = 200; i >= 0; --i) {
            if (counts[i] > 0) {
                if (map[counts[i]] == null) {
                    map[counts[i]] = new ArrayList<>();
                }
                map[counts[i]].add(i - 100);
            }
        }
        int index = 0;
        for (int i = 1; i < map.length; ++i) {
            if (map[i] != null) {
                for (int j = 0; j < i; ++j) {
                    for (int c : map[i]) {
                        nums[index++] = c;
                    }
                }
            }
        }
        return nums;
    }
}
