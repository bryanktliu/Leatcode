package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/find-the-peaks/ */
public class L2951FindThePeaks {

    public List<Integer> findPeaks(int[] mountain) {
        boolean bigger = false;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < mountain.length - 1; ++i) {
            if (mountain[i] > mountain[i + 1]) {
                if (bigger) {
                    res.add(i);
                }
                bigger = false;
            } else {
                bigger = mountain[i] < mountain[i + 1];
            }
        }
        return res;
    }
}
