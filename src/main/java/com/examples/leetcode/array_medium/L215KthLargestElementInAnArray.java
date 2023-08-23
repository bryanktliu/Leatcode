package com.examples.leetcode.array_medium;


/** https://leetcode.com/problems/kth-largest-element-in-an-array/description/ */
public class L215KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        int max = -10001;
        int min = 10001;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int[] counts = new int[max + 1 - min];
        for (int num : nums) {
            ++counts[num - min];
        }
        for (int i = counts.length - 1; i >= 0; --i) {
            k -= counts[i];
            if (k <= 0) {
                return i + min;
            }
        }
        return 0;
    }
}
