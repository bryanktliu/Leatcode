package com.examples.leetcode.array_easy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** https://leetcode.com/problems/degree-of-an-array */
public class L697DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        int[] counts = new int[50000];
        int degree = 0;
        for (int i : nums) {
            ++counts[i];
            degree = Math.max(degree, counts[i]);
        }
        if (degree < 2) {
            return degree;
        }

        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        int length = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            for (; start <= end; ++start) {
                if (counts[nums[start]] == degree) {
                    Integer pos = map.get(nums[start]);
                    if (pos == null) {
                        map.put(nums[start], start);
                        ++start;
                        break;
                    } else if (pos > start) {
                        length = Math.min(length, pos - start + 1);
                        map.put(nums[start], -1);
                        break;
                    }
                }
            }
            for (; end >= start; --end) {
                if (counts[nums[end]] == degree) {
                    Integer pos = map.get(nums[end]);
                    if (pos == null) {
                        map.put(nums[end], end);
                        --end;
                        break;
                    } else if (pos < end && pos >= 0) {
                        length = Math.min(length, end - pos + 1);
                        map.put(nums[end], -1);
                        break;
                    }
                }
            }
        }
        return length;
    }
}
