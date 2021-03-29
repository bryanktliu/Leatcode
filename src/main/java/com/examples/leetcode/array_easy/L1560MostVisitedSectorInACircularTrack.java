package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/most-visited-sector-in-a-circular-track */
public class L1560MostVisitedSectorInACircularTrack {

    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> ret = new ArrayList<>();
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        if (start == end) {
            ret.add(start);
        } else if (end < start) {
            for (int i = 1; i <= end; ++i) {
                ret.add(i);
            }
            for (int i = start; i <= n; ++i) {
                ret.add(i);
            }
        } else {
            for (int i = start; i <= end; ++i) {
                ret.add(i);
            }
        }
        return ret;
    }
}
