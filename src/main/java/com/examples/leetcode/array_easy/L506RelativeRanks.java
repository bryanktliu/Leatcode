package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/relative-ranks/ */
public class L506RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        int max = 0;
        for (int s : score) {
            if (s > max) {
                max = s;
            }
        }
        int[] map = new int[max + 1];
        for (int i = 0; i < score.length; ++i) {
            map[score[i]] = i + 1;
        }
        String[] result = new String[score.length];
        int rank = 1;
        for (int i = max; i >= 0; --i) {
            if (map[i] != 0) {
                switch (rank) {
                    case 1:
                        result[map[i] - 1] = "Gold Medal";
                        break;
                    case 2:
                        result[map[i] - 1] = "Silver Medal";
                        break;
                    case 3:
                        result[map[i] - 1] = "Bronze Medal";
                        break;
                    default:
                        result[map[i] - 1] = String.valueOf(rank);
                }
                ++rank;
            }
        }
        return result;
    }
}
