package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/rings-and-rods/ */
public class L2103RingsAndRods {

    public int countPoints(String rings) {
        boolean[][] rods = new boolean[10][3];
        int len = rings.length();
        for (int i = 0; i < len; i += 2) {
            char color = rings.charAt(i);
            int pos = rings.charAt(i + 1) - '0';
            if (color == 'R') {
                rods[pos][0] = true;
            } else if (color == 'G') {
                rods[pos][1] = true;
            } else {
                rods[pos][2] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; ++i) {
            if (rods[i][0] && rods[i][1] && rods[i][2]) {
                ++count;
            }
        }
        return count;
    }
}
