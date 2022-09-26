package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/longest-subsequence-with-limited-sum/ */
public class L2389LongestSubsequenceWithLimitedSum {

    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int sum = 0;
        for (int val : nums) {
            sum += val;
        }
        int[] query = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            if (queries[i] >= sum) {
                query[i] = nums.length;
                continue;
            }
            int current = 0;
            int index = 0;
            while (queries[i] >= current) {
                current += nums[index];
                ++index;
            }
            query[i] = index - 1;
        }
        return query;
    }
}
