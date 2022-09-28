package com.examples.leetcode.array_easy;

import java.util.Arrays;
import java.util.HashMap;

/** https://leetcode.com/problems/sort-the-people/ */
public class L2418SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap();
        for (int i = 0; i < names.length; ++i) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[names.length];
        int index = names.length - 1;
        for (int i = 0; i < names.length; i++) {
            res[index] = map.get(heights[i]);
            --index;
        }
        return res;
    }
}
