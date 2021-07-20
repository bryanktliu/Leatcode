package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/find-the-town-judge/ */
public class L997FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }
        boolean[] contains = new boolean[n + 1];
        for (int[] ints : trust) {
            contains[ints[0]] = true;
        }
        for (int i = 1; i < contains.length; ++i) {
            if (!contains[i]) {
                int count = 0;
                for (int[] ints : trust) {
                    if (ints[1] == i) {
                        ++count;
                    }
                }
                if (count == n - 1) {
                    return i;
                }
                break;
            }
        }
        return -1;
    }
}
