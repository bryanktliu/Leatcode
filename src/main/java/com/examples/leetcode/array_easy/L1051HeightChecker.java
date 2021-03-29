package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/height-checker/ */
public class L1051HeightChecker {

    public int heightChecker(int[] heights) {
        int[] counts = new int[101];
        for (int i : heights) {
            ++counts[i];
        }
        int sum = 0;
        int index = 0;
        for (int i = 0; i < 101; ++i) {
            for (int j = 0; j < counts[i]; ++j) {
                if (heights[index++] != i) {
                    ++sum;
                }
            }
        }
        return sum;
    }
}
