package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-common-elements-between-two-arrays/ */
public class L2956FindCommonElementsBetweenTwoArrays {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] counts = new int[101];
        for (int num : nums1) {
            counts[num]++;
        }
        int[] res = new int[2];
        boolean[] seen = new boolean[101];
        for (int num : nums2) {
            if (counts[num] > 0) {
                if (!seen[num]) {
                    res[0] += counts[num];
                    seen[num] = true;
                }
                res[1]++;
            }
        }
        return res;
    }
}
