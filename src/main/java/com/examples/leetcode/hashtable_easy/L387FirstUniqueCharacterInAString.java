package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/first-unique-character-in-a-string/ */
public class L387FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int index = s.length();
        for (char i = 'a'; i <= 'z'; ++i) {
            int first = s.indexOf(i);
            if (first != -1 && first == s.lastIndexOf(i)) {
                if (index > first) {
                    index = first;
                }
            }
        }
        if (index != s.length()) {
            return index;
        }
        return -1;
    }
}
