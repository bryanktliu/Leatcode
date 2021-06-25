package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/set-mismatch/ */
public class L645SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            ++count[num];
        }
        int[] result = new int[2];
        for (int i = 1; i < count.length; ++i) {
            if (count[i] == 2) {
                result[0] = i;
            } else if (count[i] == 0) {
                result[1] = i;
            }
        }
        return result;
    }
}
