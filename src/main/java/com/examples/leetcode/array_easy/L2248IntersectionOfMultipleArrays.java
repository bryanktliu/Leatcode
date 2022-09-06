package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/intersection-of-multiple-arrays/ */
public class L2248IntersectionOfMultipleArrays {

    public List<Integer> intersection(int[][] nums) {
        int max = 0;
        int min = 1000;
        int[] count = new int[1001];
        for (int[] num : nums) {
            for (int n : num) {
                ++count[n];
                if (count[n] == nums.length) {
                    max = Math.max(max, n);
                    min = Math.min(min, n);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; ++i) {
            if (count[i] == nums.length) {
                list.add(i);
            }
        }
        return list;
    }
}
