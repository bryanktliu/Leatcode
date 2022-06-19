package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-lines-to-write-string/ */
public class L806NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int row = 1;
        int count = 0;
        for (char c : s.toCharArray()) {
            count += widths[c - 'a'];
            if (count > 100) {
                ++row;
                count = widths[c - 'a'];
            }
        }
        return new int[] {row, count};
    }
}
