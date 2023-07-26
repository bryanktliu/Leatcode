package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/split-strings-by-separator/description/ */
public class L2788SplitStringsBySeparator {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            int start = 0;
            int end = word.indexOf(separator);
            while (end != -1) {
                String current = word.substring(start, end);
                if (current.length() > 0) {
                    res.add(current);
                }
                start = end + 1;
                end = word.indexOf(separator, start);
            }
            if (start < word.length()) {
                res.add(word.substring(start));
            }
        }
        return res;
    }
}
