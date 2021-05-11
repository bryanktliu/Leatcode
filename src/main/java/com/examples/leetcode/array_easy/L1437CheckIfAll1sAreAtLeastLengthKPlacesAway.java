package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/ */
public class L1437CheckIfAll1sAreAtLeastLengthKPlacesAway {

    public boolean kLengthApart(int[] nums, int k) {
        int last = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                if (last >= 0) {
                    if (i - last - 1 < k) {
                        return false;
                    }
                }
                last = i;
            }
        }
        return true;
    }
}
