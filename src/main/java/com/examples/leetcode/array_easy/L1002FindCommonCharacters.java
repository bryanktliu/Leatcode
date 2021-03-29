package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/find-common-characters/ */
public class L1002FindCommonCharacters {

    public List<String> commonChars(String[] strings) {
        int[][] arr = new int[strings.length][26];
        for (int i = 0; i < strings.length; ++i) {
            for (char c : strings[i].toCharArray()) {
                ++arr[i][c - 'a'];
            }
        }
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < strings.length; ++j) {
                if (arr[j][i] < min) {
                    min = arr[j][i];
                }
            }
            for (int j = 0; j < min; ++j) {
                ret.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ret;
    }
}
