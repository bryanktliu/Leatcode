package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/h-index/ */
public class L274HIndex {

    public int hIndex(int[] citations) {
        int[] count = new int[citations.length + 2];
        for (int citation : citations) {
            ++count[Math.min(citation, citations.length)];
        }
        for (int i = citations.length; i > 0; --i) {
            count[i] += count[i + 1];
            if (count[i] >= i) {
                return i;
            }
        }
        return 0;
    }
}
