package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** https://leetcode.com/problems/find-the-difference-of-two-arrays/ */
public class L2215FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        boolean[] set1 = new boolean[2001];
        for (int num : nums1) {
            set1[num + 1000] = true;
        }
        boolean[] set2 = new boolean[2001];
        for (int num : nums2) {
            set2[num + 1000] = true;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums1) {
            if (!set2[num + 1000]) {
                list1.add(num);
                set2[num + 1000] = true;
            }
        }
        for (int num : nums2) {
            if (!set1[num + 1000]) {
                list2.add(num);
                set1[num + 1000] = true;
            }
        }
        return Arrays.asList(list1, list2);
    }
}
