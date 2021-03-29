package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/slowest-key/ */
public class L1629SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int duration = releaseTimes[0];
        char c = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; ++i) {
            int tmp = releaseTimes[i] - releaseTimes[i - 1];
            if (tmp > duration) {
                duration = tmp;
                c = keysPressed.charAt(i);
            } else if (duration == tmp && keysPressed.charAt(i) > c) {
                c = keysPressed.charAt(i);
            }
        }
        return c;
    }
}
