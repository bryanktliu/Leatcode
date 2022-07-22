package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/two-out-of-three/ */
public class L2032TwoOutOfThree {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] counter = new boolean[101];
        boolean[] counter2 = new boolean[101];
        for (int num : nums1) {
            counter[num] = true;
            counter2[num] = true;
        }
        List<Integer> res = new ArrayList<>();
        boolean[] added = new boolean[101];
        for (int num : nums2) {
            counter2[num] = true;
            if (counter[num] && !added[num]) {
                res.add(num);
                added[num] = true;
            }
        }
        for (int num : nums3) {
            if (counter2[num] && !added[num]) {
                res.add(num);
                added[num] = true;
            }
        }
        return res;
    }
}
