package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-distinct-averages/ */
public class L2465NumberOfDistinctAverages {

    public int distinctAverages(int[] nums) {
        int[] sort = new int[101];
        for (int num : nums) {
            ++sort[num];
        }
        boolean[] sums = new boolean[201];
        int len = nums.length / 2;
        int count = 0;
        int left = 0;
        int right = 100;
        for (int i = 0; i < len; ++i) {
            while (sort[left] == 0) {
                ++left;
            }
            while (sort[right] == 0) {
                --right;
            }
            int sum = left + right;
            if (!sums[sum]) {
                ++count;
                sums[sum] = true;
            }
            --sort[left];
            --sort[right];
        }
        return count;
    }
}
