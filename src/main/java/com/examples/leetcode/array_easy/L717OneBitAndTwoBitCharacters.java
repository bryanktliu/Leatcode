package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/1-bit-and-2-bit-characters/ */
public class L717OneBitAndTwoBitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; ++i) {
            if (i == bits.length - 2 && bits[i] == 1) {
                return false;
            } else if (i == bits.length - 1) {
                return true;
            }
            if (bits[i] == 1) {
                ++i;
            }
        }
        return false;
    }
}
