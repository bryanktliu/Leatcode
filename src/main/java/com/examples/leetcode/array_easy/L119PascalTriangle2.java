package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/pascals-triangle-ii/ */
public class L119PascalTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(rowIndex);
        list.add(1);
        updateList(list, rowIndex);
        return list;
    }

    public void updateList(List<Integer> list, int rowIndex) {
        if (rowIndex == 0) {
            return;
        }
        int prev = 1;
        int temp = 1;
        for (int i = 1; i < list.size(); ++i) {
            temp = list.get(i);
            list.set(i, prev + list.get(i));
            prev = temp;
        }
        list.add(1);
        updateList(list, --rowIndex);
    }
}
