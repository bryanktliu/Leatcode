package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/maximize-the-topmost-element-after-k-moves/ */
public class L2202MaximizeTheTopmostElementAfterKMoves {

    public int maximumTop(int[] nums, int k) {
        if (nums.length == 1) {
            if (k % 2 == 0) {
                return nums[0];
            } else {
                return -1;
            }
        }
        if (k == 0) {
            return nums[0];
        } else if (k == 1) {
            return nums[1];
        }
        if (k < nums.length) {
            return Math.max(max(nums, k - 1), nums[k]);
        } else if (k == nums.length) {
            return max(nums, k - 1);
        } else {
            return max(nums, nums.length);
        }
    }

    public int max(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; ++i) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
