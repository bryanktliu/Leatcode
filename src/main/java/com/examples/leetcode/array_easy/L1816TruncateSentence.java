package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/truncate-sentence/ */
public class L1816TruncateSentence {

    public String truncateSentence(String s, int k) {
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == ' ') {
                if (k == 1) {
                    return s.substring(0, i);
                }
                --k;
            }
        }
        return s;
    }
}
