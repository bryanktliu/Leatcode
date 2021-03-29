package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/ */
public class L1491AverageSalary {

    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : salary) {
            sum += i;
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        sum -= min + max;
        return ((double) sum) / (salary.length - 2);
    }
}
