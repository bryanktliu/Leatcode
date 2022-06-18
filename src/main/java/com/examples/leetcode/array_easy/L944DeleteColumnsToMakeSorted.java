package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/delete-columns-to-make-sorted/ */
public class L944DeleteColumnsToMakeSorted {

    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int count = 0;
        for (int i = 0; i < n; ++i) {
            char last = strs[0].charAt(i);
            for (int j = 1; j < strs.length; ++j) {
                char current = strs[j].charAt(i);
                if (last > current) {
                    ++count;
                    break;
                }
                last = current;
            }
        }
        return count;
    }
}
