package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** https://leetcode.com/problems/positions-of-large-groups/ */
public class L830PositionsOfLargeGroups {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int start = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (i - start >= 3) {
                    list.add(Arrays.asList(start, i - 1));
                }
                start = i;
            }
        }
        if (s.length() - start >= 3) {
            list.add(Arrays.asList(start, s.length() - 1));
        }
        return list;
    }
}
