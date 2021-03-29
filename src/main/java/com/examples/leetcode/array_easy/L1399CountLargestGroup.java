package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-largest-group/ */
public class L1399CountLargestGroup {

    public int countLargestGroup(int n) {
        int[] counts = new int[37];
        for (int i = 1; i <= n; ++i) {
            int sum = sumOfDigit(i);
            ++counts[sum];
        }
        int count = 0;
        int max = 0;
        for (int i : counts) {
            if (i > max) {
                count = 1;
                max = i;
            } else if (i == max) {
                ++count;
            }
        }
        return count;
    }

    private int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
