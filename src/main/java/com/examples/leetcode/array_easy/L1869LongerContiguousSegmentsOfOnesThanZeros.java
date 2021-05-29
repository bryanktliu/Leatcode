package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/ */
public class L1869LongerContiguousSegmentsOfOnesThanZeros {

    public boolean checkZeroOnes(String s) {
        char[] chars = s.toCharArray();
        int[] counts = new int[2];
        int count = 1;
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i - 1]) {
                ++count;
            } else {
                if (count > counts[chars[i - 1] - '0']) {
                    counts[chars[i - 1] - '0'] = count;
                }
                count = 1;
            }
        }
        if (count > counts[chars[chars.length - 1] - '0']) {
            counts[chars[chars.length - 1] - '0'] = count;
        }
        return counts[1] > counts[0];
    }
}
