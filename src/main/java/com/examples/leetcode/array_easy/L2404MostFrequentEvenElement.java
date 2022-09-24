package com.examples.leetcode.array_easy;


/** https://leetcode.com/problems/most-frequent-even-element/ */
public class L2404MostFrequentEvenElement {

    public int mostFrequentEven(int[] nums) {
        int[] count = new int[50001];
        int max = 0;
        int maxNum = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                int pos = num / 2;
                ++count[pos];
                if (count[pos] > max) {
                    ++max;
                    maxNum = num;
                } else if (count[pos] == max && num < maxNum) {
                    maxNum = num;
                }
            }
        }
        return maxNum;
    }
}
