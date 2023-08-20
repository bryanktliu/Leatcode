package com.examples.leetcode.array_medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/interval-list-intersections/
 */
public class L986IntervalListIntersections {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        int firstIdx = 0;
        int secondIdx = 0;
        while (firstIdx < firstList.length && secondIdx < secondList.length) {
            int min = Math.max(firstList[firstIdx][0], secondList[secondIdx][0]);
            int max = Math.min(firstList[firstIdx][1], secondList[secondIdx][1]);
            if (min <= max) {
                res.add(new int[]{min, max});
            }
            if (firstList[firstIdx][1] < secondList[secondIdx][1]) {
                ++firstIdx;
            } else {
                ++secondIdx;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
