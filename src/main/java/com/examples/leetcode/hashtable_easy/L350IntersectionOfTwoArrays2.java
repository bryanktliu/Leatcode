package com.examples.leetcode.hashtable_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/intersection-of-two-arrays-ii/ */
public class L350IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count1 = new int[1001];
        for (int value : nums1) {
            ++count1[value];
        }
        List<Integer> list = new ArrayList<>();
        for (int value : nums2) {
            if (count1[value] > 0) {
                list.add(value);
                --count1[value];
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = list.get(i);
        }
        return result;
    }
}
