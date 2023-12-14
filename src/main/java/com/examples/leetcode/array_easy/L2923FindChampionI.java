package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-champion-i/ */
public class L2923FindChampionI {

    public int findChampion(int[][] grid) {
        int champ = 0;
        for (int i = 0; i < grid.length; ++i) {
            if (champ != i && grid[champ][i] == 0) {
                champ = i;
            }
        }
        return champ;
    }
}
