package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/ */
public class L2148CountElementsWithStrictlySmallerAndGreaterElements {

    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int count = 0;
        for (int num : nums) {
            if (num < max && num > min) {
                ++count;
            }
        }
        return count;
    }
}
