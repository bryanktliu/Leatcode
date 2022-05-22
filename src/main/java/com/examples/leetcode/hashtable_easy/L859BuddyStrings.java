package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/buddy-strings/ */
public class L859BuddyStrings {

    public boolean buddyStrings(String s, String goal) {
        int len = s.length();
        if (goal.length() != len) {
            return false;
        }
        if (s.equals(goal)) {
            char[] chars = new char[26];
            for (int i = 0; i < len; ++i) {
                if (chars[s.charAt(i) - 'a']++ == 1) {
                    return true;
                }
            }
            return false;
        } else {
            int dif = 0;
            for (int i = 0; i < len; ++i) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (dif++ == 2) {
                        return false;
                    }
                }
            }
            int change = -1;
            for (int i = 0; i < len; ++i) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (change == -1) {
                        change = i;
                    } else {
                        return s.charAt(i) == goal.charAt(change)
                                && s.charAt(change) == goal.charAt(i);
                    }
                }
            }
        }
        return false;
    }
}
