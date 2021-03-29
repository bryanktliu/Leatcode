package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/pascals-triangle */
public class L118PascalTriangle {

    public List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if (numRows == 0) {
            return ret;
        }
        List<Integer> list = new ArrayList<>(1);
        ret.add(list);
        list.add(1);
        for (int i = 1; i < numRows; ++i) {
            list = new ArrayList<>(i);
            ret.add(list);
            list.add(1);
            List<Integer> prev = ret.get(i - 1);
            for (int j = 1; j < prev.size(); ++j) {
                list.add(prev.get(j - 1) + prev.get(j));
            }
            list.add(1);
        }
        return ret;
    }
}
