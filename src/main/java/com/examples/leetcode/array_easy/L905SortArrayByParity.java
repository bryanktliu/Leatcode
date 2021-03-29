package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sort-array-by-parity/ */
public class L905SortArrayByParity {

    public int[] sortArrayByParity(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] % 2 == 0) {
                ++start;
                continue;
            }
            if (arr[end] % 2 != 0) {
                --end;
                continue;
            }
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }
        return arr;
    }
}
