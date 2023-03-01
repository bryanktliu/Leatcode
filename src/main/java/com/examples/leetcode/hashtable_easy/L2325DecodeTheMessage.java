package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/decode-the-message/ */
public class L2325DecodeTheMessage {

    public String decodeMessage(String key, String message) {
        char[] map = new char[123];
        map[' '] = ' ';
        char current = 'a';
        for (char c : key.toCharArray()) {
            if (map[c] == 0) {
                map[c] = current;
                ++current;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            sb.append(map[c]);
        }
        return sb.toString();
    }
}
