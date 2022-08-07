package com.examples.leetcode.array_easy;

import java.util.HashMap;

/** https://leetcode.com/problems/kth-distinct-string-in-an-array/ */
public class L2053KthDistinctStringInAnArray {

    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> counts = new HashMap<>();
        for (String s : arr) {
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (counts.get(s) == 1) {
                if (--k == 0) {
                    return s;
                }
            }
        }
        return "";
    }
}
