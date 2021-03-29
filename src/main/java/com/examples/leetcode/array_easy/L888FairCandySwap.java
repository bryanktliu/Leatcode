package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/fair-candy-swap/ */
public class L888FairCandySwap {

    public int[] fairCandySwap(int[] arr1, int[] arr2) {
        int diff = (sum(arr1) - sum(arr2)) / 2;
        int[] ints = new int[100001];
        for (int i : arr2) {
            ++ints[i];
        }
        for (int i : arr1) {
            int index = i - diff;
            if (index >= 0 && index < ints.length && ints[index] > 0) {
                return new int[] {i, index};
            }
        }
        return null;
    }

    private int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
