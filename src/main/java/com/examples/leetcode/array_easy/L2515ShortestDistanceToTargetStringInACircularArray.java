package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/ */
public class L2515ShortestDistanceToTargetStringInACircularArray {

    public int closetTarget(String[] words, String target, int startIndex) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                int dif = Math.abs(i - startIndex);
                min = Math.min(Math.min(min, dif), words.length - dif);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}
