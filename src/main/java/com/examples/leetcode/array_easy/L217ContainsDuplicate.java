package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/contains-duplicate */
public class L217ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int[] counts = new int[max - min + 1];
        for (int i : nums) {
            if (++counts[i - min] > 1) {
                return true;
            }
        }
        return false;
    }
}
