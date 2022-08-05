package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/find-target-indices-after-sorting-array/ */
public class L2089FindTargetIndicesAfterSortingArray {

    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;
        int correct = 0;
        for (int num : nums) {
            if (num < target) {
                ++less;
            } else if (num == target) {
                ++correct;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < correct; ++i) {
            res.add(less++);
        }
        return res;
    }
}
