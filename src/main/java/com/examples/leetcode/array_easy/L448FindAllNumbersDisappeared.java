package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array */
public class L448FindAllNumbersDisappeared {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != i + 1) {
                int pos = nums[i] - 1;
                int tmp = nums[pos];
                if (tmp == nums[i]) {
                    break;
                }
                nums[pos] = nums[i];
                nums[i] = tmp;
            }
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i + 1) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
