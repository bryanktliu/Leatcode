package com.examples.leetcode.hashtable_easy;

import java.util.ArrayList;

/** https://leetcode.com/problems/keyboard-row/ */
public class L500KeyboardRow {

    public String[] findWords(String[] words) {
        String row3 = "zxcvbnmZXCVBNM";
        String row2 = "asdfghjklASDFGHJKL";
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            int row = 0;
            boolean same = true;
            for (char c : word.toCharArray()) {
                if (row3.indexOf(c) != -1) {
                    if (row == 0 || row == 3) {
                        row = 3;
                    } else {
                        same = false;
                        break;
                    }
                } else if (row2.indexOf(c) != -1) {
                    if (row == 0 || row == 2) {
                        row = 2;
                    } else {
                        same = false;
                        break;
                    }
                } else if (row == 0 || row == 1) {
                    row = 1;
                } else {
                    same = false;
                    break;
                }
            }
            if (same) {
                list.add(word);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = list.get(i);
        }
        return result;
    }
}
