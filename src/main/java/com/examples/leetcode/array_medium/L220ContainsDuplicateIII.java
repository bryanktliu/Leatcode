package com.examples.leetcode.array_medium;

import java.util.TreeSet;

/** https://leetcode.com/problems/contains-duplicate-iii/ */
public class L220ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> window = new TreeSet<>();
        window.add((long) nums[0]);
        for (int i = 1; i < nums.length; ++i) {
            if (window.size() > k) {
                window.remove((long) nums[i - k - 1]);
            }
            if (window.contains((long) nums[i])) {
                return true;
            }
            Long next = window.ceiling((long) nums[i]);
            if (next != null && next - nums[i] <= t) {
                return true;
            }
            Long last = window.floor((long) nums[i]);
            if (last != null && nums[i] - last <= t) {
                return true;
            }
            window.add((long) nums[i]);
        }
        return false;
    }
}
