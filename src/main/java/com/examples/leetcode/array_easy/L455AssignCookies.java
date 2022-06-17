package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/assign-cookies/ */
public class L455AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int taken = 0;
        for (int size : s) {
            if (taken == g.length) {
                break;
            }
            if (size >= g[taken]) {
                ++taken;
            }
        }
        return taken;
    }
}
