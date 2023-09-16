package com.examples.leetcode.hashtable_easy;

import java.util.List;

/** https://leetcode.com/problems/points-that-intersect-with-cars/description/ */
public class L2848PointsThatIntersectWithCars {

    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] seen = new boolean[101];
        for (List<Integer> list : nums) {
            int end = list.get(1) + 1;
            for (int i = list.get(0); i < end; ++i) {
                seen[i] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 101; ++i) {
            if (seen[i]) {
                ++count;
            }
        }
        return count;
    }
}
