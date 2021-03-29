package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sort-array-by-parity-ii/ */
public class L922SortArrayByParity2 {

    public int[] sortArrayByParityII(int[] arr) {
        int[] nums = new int[arr.length];
        int even = 0;
        int odd = 1;
        for (int i : arr) {
            if (i % 2 != 0) {
                nums[odd] = i;
                odd += 2;
            } else {
                nums[even] = i;
                even += 2;
            }
        }
        return nums;
    }
}
