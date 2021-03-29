package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** https://leetcode.com/problems/minimum-absolute-difference/ */
public class L1200MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        if (arr.length == 0) {
            return Collections.emptyList();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; ++i) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> pair = new ArrayList<>(2);
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                list.add(pair);
            }
        }
        return list;
    }
}
