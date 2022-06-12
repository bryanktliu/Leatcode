package com.examples.leetcode.array_medium;

import java.util.*;

/** https://leetcode.com/problems/3sum/ */
public class L15ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            if ((i > 0 && nums[i - 1] == nums[i])) {
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum < 0) {
                    ++start;
                } else if (sum > 0) {
                    --end;
                } else {
                    triplets.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    ++start;
                    --end;
                    while (start < end && nums[start] == nums[start - 1]) {
                        ++start;
                    }
                    while (start < end && nums[end] == nums[end + 1]) {
                        --end;
                    }
                }
            }
        }
        return triplets;
    }
}
