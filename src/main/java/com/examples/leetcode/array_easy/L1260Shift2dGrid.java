package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/shift-2d-grid/ */
public class L1260Shift2dGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ret = new ArrayList<>(grid.length);
        int total = grid.length * grid[0].length;
        k %= total;
        if (k > 0) {
            k = total - k;
        }
        int x = k / grid[0].length;
        int y = k % grid[0].length;

        List<Integer> list = new ArrayList<>(grid.length);
        ret.add(list);
        for (int i = 0; i < total; ++i) {
            if (list.size() == grid[0].length) {
                list = new ArrayList<>();
                ret.add(list);
            }
            list.add(grid[x][y]);
            if (++y >= grid[0].length) {
                y = 0;
                if (++x >= grid.length) {
                    x = 0;
                }
            }
        }
        return ret;
    }
}
