package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-losers-of-the-circular-game/ */
public class L2682FindTheLosersOfTheCircularGame {

    public int[] circularGameLosers(int n, int k) {
        boolean[] visited = new boolean[n];
        int current = 0;
        int round = 1;
        while (!visited[current]) {
            visited[current] = true;
            current = (current + round++ * k) % n;
        }
        int[] res = new int[n - round + 1];
        int index = 0;
        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                res[index++] = i + 1;
            }
        }
        return res;
    }
}
