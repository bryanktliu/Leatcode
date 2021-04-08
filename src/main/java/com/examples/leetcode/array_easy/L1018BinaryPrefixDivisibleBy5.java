package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/binary-prefix-divisible-by-5/ */
public class L1018BinaryPrefixDivisibleBy5 {

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();
        int val = 0;
        for (int i : A) {
            val = (2 * val + i) % 5;
            result.add(val % 5 == 0);
        }
        return result;
    }
}
