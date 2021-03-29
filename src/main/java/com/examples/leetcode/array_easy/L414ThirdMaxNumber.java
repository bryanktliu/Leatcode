package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/third-maximum-number/ */
public class L414ThirdMaxNumber {

    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean found = false;
        for (int i : nums) {
            if (i == Integer.MIN_VALUE) {
                found = true;
            }
            if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (i > second && i != first) {
                third = second;
                second = i;
            } else if (i > third && i != first && i != second) {
                third = i;
            }
        }
        if (third == Integer.MIN_VALUE) {
            if (found && second != Integer.MIN_VALUE) {
                return third;
            }
            return first;
        }
        return third;
    }
}
