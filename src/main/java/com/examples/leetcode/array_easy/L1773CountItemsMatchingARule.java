package com.examples.leetcode.array_easy;

import java.util.List;

/** https://leetcode.com/problems/count-items-matching-a-rule/ */
public class L1773CountItemsMatchingARule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int needed;
        if (ruleKey.equals("type")) {
            needed = 0;
        } else if (ruleKey.equals("color")) {
            needed = 1;
        } else {
            needed = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(needed))) {
                ++count;
            }
        }
        return count;
    }
}
