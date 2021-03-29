package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sum-of-even-numbers-after-queries/ */
public class L985SumOfEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
        int sum = 0;
        boolean[] even = new boolean[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            even[i] = arr[i] % 2 == 0;
            if (even[i]) {
                sum += arr[i];
            }
        }

        int[] ret = new int[arr.length];
        for (int i = 0; i < queries.length; ++i) {
            int index = queries[i][1];
            int value = queries[i][0];
            boolean newEven = value % 2 == 0;
            if (even[index]) {
                if (newEven) {
                    sum += value;
                } else {
                    even[index] = false;
                    sum -= arr[index];
                }
            } else if (!newEven) {
                sum += value + arr[index];
                even[index] = true;
            }
            ret[i] = sum;
            arr[index] += value;
        }
        return ret;
    }
}
