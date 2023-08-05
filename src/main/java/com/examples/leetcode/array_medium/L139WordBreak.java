package com.examples.leetcode.array_medium;

import java.util.List;

/** https://leetcode.com/problems/word-break/ */
public class L139WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(new boolean[s.length()], s, wordDict, 0);
    }

    public boolean solve(boolean[] dp_seen, String s, List<String> wordDict, int index) {
        if (index == s.length()) {
            return true;
        }
        for (String word : wordDict) {
            int len = word.length();
            if (index + len > s.length() || dp_seen[index + len - 1]) {
                continue;
            }
            if (s.startsWith(word, index)) {
                dp_seen[index + len - 1] = true;
                if (solve(dp_seen, s, wordDict, index + len)) {
                    return true;
                }
            }
        }
        return false;
    }
}
