package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-closest-number-to-zero/ */
public class L2239FindClosestNumberToZero {

    public int findClosestNumber(int[] nums) {
        int closest = 100001;
        int abs = 100001;
        for (int num : nums) {
            int distance = Math.abs(num);
            if (distance < abs) {
                closest = num;
                abs = Math.abs(closest);
            } else if (distance == abs && num != closest) {
                closest = distance;
            }
        }
        return closest;
    }
}
