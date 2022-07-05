package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/unique-number-of-occurrences/ */
public class L1207UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        for (int i : arr) {
            ++count[i + 1000];
        }
        int[] countCounts = new int[1000];
        for (int i : count) {
            if (i != 0) {
                if (countCounts[i] != 0) {
                    return false;
                }
                ++countCounts[i];
            }
        }
        return true;
    }
}
