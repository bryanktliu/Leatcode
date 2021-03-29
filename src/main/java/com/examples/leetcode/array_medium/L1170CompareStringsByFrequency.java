package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/ */
public class L1170CompareStringsByFrequency {

    @SuppressWarnings("PMD")
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ints = new int[12];
        for (String word : words) {
            ++ints[count(word)];
        }
        for (int i = 10; i > 0; --i) {
            ints[i - 1] += ints[i];
        }
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int count = count(queries[i]);
            ret[i] = ints[count + 1];
        }
        return ret;
    }

    private int count(String word) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (char c : word.toCharArray()) {
            if (c < min) {
                min = c;
                count = 1;
            } else if (c == min) {
                ++count;
            }
        }
        return count;
    }
}
