package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/ */
public class L2917FindTheKOrOfAnArray {

    public int findKOr(int[] nums, int k) {
        int total = 0;
        for (int i = 0; ; ++i) {
            int count = 0;
            int end = 0;
            for (int j = 0; j < nums.length; ++j) {
                count += nums[j] & 1;
                nums[j] >>= 1;
                if (nums[j] == 0) {
                    ++end;
                }
            }
            if (count >= k) {
                total += 1 << i;
            }
            if (end == nums.length) {
                break;
            }
        }
        return total;
    }
}
