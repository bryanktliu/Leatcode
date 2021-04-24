package com.examples.leetcode.array_easy;

import java.util.HashMap;

/** https://leetcode.com/problems/contains-duplicate-ii/ */
public class L219ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; ++i) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], i);
                continue;
            }
            if (i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
