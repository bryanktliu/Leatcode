package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sum-of-unique-elements/ */
public class L1748SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            ++count[num];
        }
        int total = 0;
        for (int i = 0; i < count.length; ++i) {
            if (count[i] == 1) {
                total += i;
            }
        }
        return total;
    }
}
