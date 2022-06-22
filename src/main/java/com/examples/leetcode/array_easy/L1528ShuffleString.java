package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/shuffle-string/ */
public class L1528ShuffleString {

    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] restored = new char[n];
        for (int i = 0; i < n; ++i) {
            restored[indices[i]] = s.charAt(i);
        }
        return String.valueOf(restored);
    }
}
