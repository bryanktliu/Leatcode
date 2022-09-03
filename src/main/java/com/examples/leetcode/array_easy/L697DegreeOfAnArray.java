package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/degree-of-an-array */
public class L697DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        int size = 0;
        for (int num : nums) {
            if (num > size) {
                size = num;
            }
        }
        ++size;
        int[] start = new int[size];
        int[] end = new int[size];
        int[] count = new int[size];
        for (int i = 0; i < nums.length; ++i) {
            if (start[nums[i]] == 0) {
                start[nums[i]] = i + 1;
            }
            ++count[nums[i]];
            end[nums[i]] = i + 1;
        }
        int max = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; ++i) {
            if (count[i] > max) {
                list = new ArrayList<>();
                list.add(i);
                max = count[i];
            } else if (count[i] == max) {
                list.add(i);
            }
        }
        int minDistance = 500000;
        for (int num : list) {
            int dif = end[num] - start[num] + 1;
            if (dif < minDistance) {
                minDistance = dif;
            }
        }
        return minDistance;
    }
}
