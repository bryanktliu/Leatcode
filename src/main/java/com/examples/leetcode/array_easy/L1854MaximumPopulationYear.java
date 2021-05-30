package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-population-year/ */
public class L1854MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for (int[] log : logs) {
            ++years[log[0] - 1950];
            --years[log[1] - 1950];
        }
        int year = 0;
        int max = 0;
        int current = 0;
        for (int i = 0; i < years.length; ++i) {
            current += years[i];
            if (current > max) {
                max = current;
                year = i;
            }
        }
        return year + 1950;
    }
}
