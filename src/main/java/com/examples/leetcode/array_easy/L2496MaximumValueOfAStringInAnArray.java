package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/ */
public class L2496MaximumValueOfAStringInAnArray {

    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) {
            int current = 0;
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (c > '9') {
                    current = chars.length;
                    break;
                }
                current = current * 10 + (c - '0');
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
