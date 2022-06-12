package com.examples.leetcode.array_medium;

import java.util.Arrays;

/** https://leetcode.com/problems/3sum-closest/ */
public class L16ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int dif = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {
                    if (sum - target < dif) {
                        dif = sum - target;
                        ans = sum;
                    }
                    --end;
                } else if (sum < target) {
                    if (target - sum < dif) {
                        dif = target - sum;
                        ans = sum;
                    }
                    ++start;
                } else {
                    return sum;
                }
            }
        }
        return ans;
    }
}
