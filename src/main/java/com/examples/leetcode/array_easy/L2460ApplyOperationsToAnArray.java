package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/apply-operations-to-an-array/ */
public class L2460ApplyOperationsToAnArray {

    public int[] applyOperations(int[] nums) {
        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                continue;
            }
            if (i == nums.length - 1) {
                res[index] = nums[nums.length - 1];
                break;
            }
            if (nums[i] == nums[i + 1]) {
                res[index++] = nums[i++] * 2;
            } else {
                res[index++] = nums[i];
            }
        }
        return res;
    }
}
