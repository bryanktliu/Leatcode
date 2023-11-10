package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/last-visited-integers/ */
public class L2899LastVisitedIntegers {

    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> res = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        int k = 0;
        for (String word : words) {
            if (word.equals("prev")) {
                if (k < integers.size()) {
                    res.add(integers.get(integers.size() - k - 1));
                    ++k;
                } else {
                    res.add(-1);
                }
            } else {
                k = 0;
                integers.add(Integer.valueOf(word));
            }
        }
        return res;
    }
}
