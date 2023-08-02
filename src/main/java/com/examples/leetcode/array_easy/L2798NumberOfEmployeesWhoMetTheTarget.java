package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-employees-who-met-the-target/ */
public class L2798NumberOfEmployeesWhoMetTheTarget {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                ++count;
            }
        }
        return count;
    }
}
