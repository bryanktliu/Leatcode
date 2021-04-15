package com.examples.leetcode.array_easy;

import java.util.HashSet;

/** https://leetcode.com/problems/check-if-n-and-its-double-exist/ */
public class L1346CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : arr) {
            if (set.contains(value * 2) || (value / 2 * 2 == value && set.contains(value / 2))) {
                return true;
            }
            set.add(value);
        }
        return false;
    }
}
