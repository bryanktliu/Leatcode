package com.examples.leetcode.array_easy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** https://leetcode.com/problems/two-sum/ */
public class L1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            int other = target - nums[i];
            Integer index = map.get(other);
            if (index != null && index != i) {
                ret[0] = i;
                ret[1] = index;
                break;
            }
        }
        return ret;
    }
}
