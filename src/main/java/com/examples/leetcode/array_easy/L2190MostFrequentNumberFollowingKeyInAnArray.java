package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/ */
public class L2190MostFrequentNumberFollowingKeyInAnArray {

    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001];
        int len = nums.length - 1;
        for (int i = 0; i < len; ++i) {
            if (nums[i] == key) {
                ++count[nums[i + 1]];
            }
        }
        int max = 0;
        int maxNum = 0;
        for (int i = 1; i < 1001; ++i) {
            if (count[i] > max) {
                max = count[i];
                maxNum = i;
            }
        }
        return maxNum;
    }
}
