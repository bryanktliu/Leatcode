package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/shortest-distance-to-a-character/ */
public class L821ShortestDistanceToACharacter {

    public int[] shortestToChar(String s, char c) {
        int[] closest = new int[s.length()];
        int last = -10001;
        char[] string = s.toCharArray();
        for (int i = 0; i < string.length; ++i) {
            if (string[i] == c) {
                last = i;
            }
            closest[i] = i - last;
        }
        for (int i = last - 1; i >= 0; --i) {
            if (string[i] == c) {
                last = i;
            }
            closest[i] = Math.min(closest[i], last - i);
        }
        return closest;
    }
}
