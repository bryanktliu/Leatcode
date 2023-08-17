package com.examples.leetcode.array_medium;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/ */
public class L2610ConvertAnArrayIntoA2DArrayWithConditions {

    public List<List<Integer>> findMatrix(int[] nums) {
        int max = 0;
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            ++count[num];
            max = Math.max(max, count[num]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < max; ++i) {
            res.add(new ArrayList<>());
        }
        for (int i = 1; i < count.length; ++i) {
            for (int j = 0; j < count[i]; ++j) {
                res.get(j).add(i);
            }
        }
        return res;
    }
}
