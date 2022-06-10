package com.examples.leetcode.array_medium;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class L11ContainerWithMostWater {

    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Math.min(height[0], height[end]) * end;
        while (end > start) {
            if (height[end] > height[start]) {
                int temp = height[start];
                while (temp >= height[start] && end > start) {
                    ++start;
                }
            } else {
                int temp = height[end];
                while (temp >= height[end] && end > start) {
                    --end;
                }
            }
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
        }
        return max;
    }
}
