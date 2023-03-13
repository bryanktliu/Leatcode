package com.examples.leetcode.array_medium;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/subsets/ */
public class L78Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        addSubsets(list, new ArrayList<>(), 0, nums);
        return list;
    }

    public void addSubsets(List<List<Integer>> list, List<Integer> subset, int i, int[] nums) {
        if (i == nums.length) {
            list.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        addSubsets(list, subset, i + 1, nums);
        subset.remove(subset.size() - 1);
        addSubsets(list, subset, i + 1, nums);
    }
}
