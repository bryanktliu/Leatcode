package com.examples.leetcode.array_easy;

import java.util.ArrayDeque;
import java.util.Deque;

/** https://leetcode.com/problems/next-greater-element-i/ */
public class L496NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001];
        Deque<Pair> smaller = new ArrayDeque<>();
        smaller.addLast(new Pair(nums2[0], 0));
        for (int i = 1; i < nums2.length; ++i) {
            while (!smaller.isEmpty() && nums2[i] > smaller.peekLast().val) {
                nextGreater[smaller.pollLast().val] = nums2[i];
            }
            smaller.addLast(new Pair(nums2[i], i));
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            if (nextGreater[nums1[i]] == 0) {
                res[i] = -1;
            } else {
                res[i] = nextGreater[nums1[i]];
            }
        }
        return res;
    }

    public static class Pair {

        int val;
        int pos;

        public Pair(int val, int pos) {
            this.val = val;
            this.pos = pos;
        }
    }
}
