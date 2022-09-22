package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** https://leetcode.com/problems/merge-similar-items/ */
public class L2363MergeSimilarItems {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] count = new int[1001];
        for (int[] item : items1) {
            count[item[0]] = item[1];
        }
        for (int[] item : items2) {
            count[item[0]] += item[1];
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < count.length; ++i) {
            if (count[i] != 0) {
                list.add(Arrays.asList(i, count[i]));
            }
        }
        return list;
    }
}
