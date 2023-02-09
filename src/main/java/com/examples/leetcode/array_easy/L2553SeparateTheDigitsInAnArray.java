package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/separate-the-digits-in-an-array/ */
public class L2553SeparateTheDigitsInAnArray {

    public int[] separateDigits(int[] nums) {
        int len = 0;
        for (int num : nums) {
            int temp = num;
            while (temp > 9) {
                ++len;
                temp /= 10;
            }
            ++len;
        }
        int[] ans = new int[len];
        int start = 0;
        for (int i = 0; i < nums.length; ++i) {
            int temp = nums[i];
            int length = 1;
            while (temp > 9) {
                ++length;
                temp /= 10;
            }
            int index = start + length - 1;
            while (nums[i] > 9) {
                ans[index--] = nums[i] % 10;
                nums[i] /= 10;
                ++start;
            }
            ++start;
            ans[index] = nums[i];
        }
        return ans;
    }
}
