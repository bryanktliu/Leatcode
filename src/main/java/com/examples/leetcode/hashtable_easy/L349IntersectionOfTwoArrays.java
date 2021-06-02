package com.examples.leetcode.hashtable_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/intersection-of-two-arrays/ */
public class L349IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] set = new boolean[1001];
        for (int value : nums1) {
            set[value] = true;
        }
        List<Integer> list = new ArrayList<>();
        for (int value : nums2) {
            if (set[value]) {
                list.add(value);
                set[value] = false;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = list.get(i);
        }
        return result;
    }
}
