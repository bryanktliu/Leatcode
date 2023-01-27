package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/longest-nice-substring/ */
public class L1763LongestNiceSubstring {

    public String longestNiceSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] ans = findNice(chars, 0, s.length() - 1);
        return s.substring(ans[0], ans[1] + 1);
    }

    public int[] findNice(char[] chars, int start, int end) {
        if (end - start < 1) {
            return new int[] {0, -1};
        }
        boolean[] letters = new boolean[58];
        for (int i = start; i <= end; ++i) {
            letters[chars[i] - 'A'] = true;
        }
        for (int i = start; i <= end; ++i) {
            int index = chars[i] - 'A';
            if (index > 26) {
                index -= 32;
            }
            if (letters[index] != letters[index + 32]) {
                int[] left = findNice(chars, start, i - 1);
                int[] right = findNice(chars, i + 1, end);
                if (left[1] - left[0] >= right[1] - right[0]) {
                    return left;
                }
                return right;
            }
        }
        return new int[] {start, end};
    }
}
