package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sum-of-squares-of-special-elements/ */
public class L2778SumOfSquaresOfSpecialElements {

    public int sumOfSquares(int[] nums) {
        if (nums.length == 1) {
            return nums[0] * nums[0];
        }
        int end = (int) Math.sqrt(nums.length) + 1;
        int sum = nums[0] * nums[0] + nums[nums.length - 1] * nums[nums.length - 1];
        for (int i = 2; i < end; ++i) {
            if (nums.length % i == 0) {
                sum += nums[i - 1] * nums[i - 1];
                int div = nums.length / i;
                if (i != div) {
                    sum += nums[div - 1] * nums[div - 1];
                }
            }
        }
        return sum;
    }
}
