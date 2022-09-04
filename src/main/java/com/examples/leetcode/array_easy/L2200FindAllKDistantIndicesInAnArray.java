package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/ */
public class L2200FindAllKDistantIndicesInAnArray {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == key) {
                int end = Math.min(nums.length - 1, i + k);
                for (start = Math.max(i - k, start); start <= end; ++start) {
                    res.add(start);
                }
            }
        }
        return res;
    }
}
