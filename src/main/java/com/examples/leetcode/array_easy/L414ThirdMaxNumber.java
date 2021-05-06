package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/third-maximum-number/ */
public class L414ThirdMaxNumber {

    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean found = false;
        for (int num : nums) {
            if (num == Integer.MIN_VALUE) {
                found = true;
            }
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }
        if (third == Integer.MIN_VALUE) {
            if (found && second > Integer.MIN_VALUE) {
                return third;
            }
            return first;
        }
        return third;
    }
}
