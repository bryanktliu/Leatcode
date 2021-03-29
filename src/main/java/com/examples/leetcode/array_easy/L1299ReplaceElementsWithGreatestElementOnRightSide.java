package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/ */
public class L1299ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int current = 0;
        int prev = -1;
        for (int i = arr.length - 1; i >= 0; --i) {
            current = Math.max(current, arr[i]);
            arr[i] = prev;
            prev = current;
        }
        return arr;
    }
}
