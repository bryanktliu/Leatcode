package com.examples.leetcode.array_easy;


/** https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/ */
public class L1005MaximizeSumOfArrayAfterKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] count = new int[201];
        for (int num : nums) {
            ++count[num + 100];
        }
        int sum = 0;
        int absMin = Integer.MAX_VALUE;
        for (int i = 0; i < count.length; ++i) {
            if (count[i] == 0) {
                continue;
            }
            for (int j = 0; j < count[i]; ++j) {
                int num = i - 100;
                if (k > 0 && num < 0) {
                    num = -num;
                    --k;
                }
                sum += num;
                if (absMin > num) {
                    absMin = num;
                }
            }
        }
        if (k % 2 == 1) {
            sum -= absMin * 2;
        }
        return sum;
    }
}
