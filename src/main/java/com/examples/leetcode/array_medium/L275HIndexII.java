package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/h-index-ii/ */
public class L275HIndexII {

    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (citations[mid] == citations.length - mid) {
                return citations.length - mid;
            } else if (citations[mid] < citations.length - mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return citations.length - low;
    }
}
