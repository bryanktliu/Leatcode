package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/furthest-point-from-origin/ */
public class L2833FurthestPointFromOrigin {

    public int furthestDistanceFromOrigin(String moves) {
        int pos = 0;
        int space = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                --pos;
            } else if (c == 'R') {
                ++pos;
            } else {
                ++space;
            }
        }
        return Math.abs(pos) + space;
    }
}
