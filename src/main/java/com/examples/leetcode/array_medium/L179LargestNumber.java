package com.examples.leetcode.array_medium;

import java.util.Arrays;

/** https://leetcode.com/problems/largest-number/ */
public class L179LargestNumber {

    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(
                strings,
                (o1, o2) -> {
                    String s1 = o1 + o2;
                    String s2 = o2 + o1;
                    return s2.compareTo(s1);
                });
        if (strings[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}
