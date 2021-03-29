package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/duplicate-zeros/ */
public class L1089DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int count = 0;
        int exclusive = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                if (i + count >= arr.length - 1) {
                    exclusive = i;
                    break;
                }
                ++count;
            }
        }
        if (count == 0) {
            return;
        }
        int index = arr.length - 1;
        for (int i = arr.length - 1 - count; i >= 0; --i) {
            arr[index--] = arr[i];
            if (arr[i] == 0 && i != exclusive) {
                arr[index--] = 0;
            }
        }
    }
}
