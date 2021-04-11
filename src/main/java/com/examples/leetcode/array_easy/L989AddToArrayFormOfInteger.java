package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/add-to-array-form-of-integer/ */
public class L989AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
        for (int i = num.length - 1; i > -1; --i) {
            if (k == 0) {
                break;
            }
            k += num[i];
            num[i] = k % 10;
            k /= 10;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (k != 0) {
            int length = (int) Math.log10(k) + 1;
            int[] remain = new int[length];
            for (int i = 0; i < length; ++i) {
                remain[length - i - 1] = k % 10;
                k /= 10;
            }
            for (int i = 0; i < length; ++i) {
                list.add(remain[i]);
            }
        }
        for (int value : num) {
            list.add(value);
        }
        return list;
    }
}
