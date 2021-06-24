package com.examples.leetcode.hashtable_easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 */
public class L599MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; ++i) {
            map.put(list1[i], i);
        }
        ArrayList<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length && i <= min; ++i) {
            if (map.get(list2[i]) != null) {
                int index = i + map.get(list2[i]);
                if (index < min) {
                    list.clear();
                    list.add(list2[i]);
                    min = index;
                } else if (index == min) {
                    list.add(list2[i]);
                }
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = list.get(i);
        }
        return result;
    }
}
