package com.examples.leetcode.hashtable_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/path-crossing/ */
public class L1496PathCrossing {

    public boolean isPathCrossing(String path) {
        HashSet<Integer> seen = new HashSet<>();
        int x = 0;
        int y = 0;
        seen.add(0);
        int len = path.length();
        for (int i = 0; i < len; ++i) {
            char c = path.charAt(i);
            if (c == 'N') {
                --x;
            } else if (c == 'S') {
                ++x;
            } else if (c == 'E') {
                ++y;
            } else {
                --y;
            }
            if (!seen.add(x * 10000 + y)) {
                return true;
            }
        }
        return false;
    }
}
