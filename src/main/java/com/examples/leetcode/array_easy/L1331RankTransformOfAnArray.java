package com.examples.leetcode.array_easy;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** https://leetcode.com/problems/rank-transform-of-an-array */
public class L1331RankTransformOfAnArray {

    public int[] arrayRankTransform(int[] arr) {
        int[] ret = new int[arr.length];
        System.arraycopy(arr, 0, ret, 0, arr.length);
        Arrays.sort(arr);
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        int rank = 1;
        map.put(arr[0], 1);
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != arr[i - 1]) {
                map.put(arr[i], ++rank);
            }
        }
        for (int i = 0; i < ret.length; ++i) {
            ret[i] = map.get(ret[i]);
        }
        return ret;
    }
}
