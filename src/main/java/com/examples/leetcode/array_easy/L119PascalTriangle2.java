package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** https://leetcode.com/problems/pascals-triangle-ii/ */
public class L119PascalTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.emptyList();
        }
        List<Integer> ret = new ArrayList<>(rowIndex);
        List<Integer> prev = new ArrayList<>(rowIndex);
        prev.add(1);
        for (int i = 1; i < rowIndex; ++i) {
            ret.clear();
            ret.add(1);
            for (int j = 1; j < i; ++j) {
                ret.add(prev.get(j - 1) + prev.get(j));
            }
            ret.add(1);
            List<Integer> tmp = prev;
            prev = ret;
            ret = tmp;
        }
        return prev;
    }
}
