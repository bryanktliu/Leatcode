package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/find-the-duplicate-number/ */
public class L287FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int fast = nums[nums[nums[0]]];
        int slow = nums[nums[0]];
        while (slow != fast) {
            fast = nums[nums[fast]];
            slow = nums[slow];
        }
        slow = nums[0];
        while (slow != fast) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }

    public int findDuplicate2(int[] nums) {
        int[] counts = new int[nums.length];
        for (int num : nums) {
            if (counts[num] != 0) {
                return num;
            }
            ++counts[num];
        }
        return 0;
    }
}
