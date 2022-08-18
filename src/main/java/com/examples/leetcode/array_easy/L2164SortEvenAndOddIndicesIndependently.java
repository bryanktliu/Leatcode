package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sort-even-and-odd-indices-independently/ */
public class L2164SortEvenAndOddIndicesIndependently {

    public int[] sortEvenOdd(int[] nums) {
        int[] evens = new int[101];
        int[] odds = new int[101];
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i % 2 == 0) {
                evens[nums[i]]++;
            } else {
                odds[nums[i]]++;
            }
        }
        int evenCount = 0;
        int oddCount = 100;
        for (int i = 0; i < nums.length; ++i) {
            if (i % 2 == 0) {
                while (evens[evenCount] == 0) {
                    ++evenCount;
                }
                evens[evenCount]--;
                nums[i] = evenCount;
            } else {
                while (odds[oddCount] == 0) {
                    --oddCount;
                }
                odds[oddCount]--;
                nums[i] = oddCount;
            }
        }
        return nums;
    }
}
