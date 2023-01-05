package com.examples.leetcode.array_easy;

/**
 * https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
 */
public class L2455AverageValueOfEvenNumbersThatAreDivisibleByThree {

    public int averageValue(int[] nums) {
        int total = 0;
        int threes = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                total += num;
                ++threes;
            }
        }
        if (threes == 0) {
            return 0;
        }
        return total / threes;
    }
}
