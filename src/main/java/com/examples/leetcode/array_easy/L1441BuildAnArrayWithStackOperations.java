package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/build-an-array-with-stack-operations/ */
public class L1441BuildAnArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int number = 1;
        for (int j : target) {
            while (number < j) {
                result.add("Push");
                result.add("Pop");
                ++number;
            }
            result.add("Push");
            ++number;
        }
        return result;
    }
}
