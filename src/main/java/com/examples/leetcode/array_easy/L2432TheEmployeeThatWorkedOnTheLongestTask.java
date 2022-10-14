package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/ */
public class L2432TheEmployeeThatWorkedOnTheLongestTask {

    public int hardestWorker(int n, int[][] logs) {
        int maxID = logs[0][0];
        int maxTime = logs[0][1];
        for (int i = 1; i < logs.length; ++i) {
            if (logs[i][1] - logs[i - 1][1] > maxTime) {
                maxID = logs[i][0];
                maxTime = logs[i][1] - logs[i - 1][1];
            } else if (logs[i][1] - logs[i - 1][1] == maxTime && logs[i][0] < maxID) {
                maxID = logs[i][0];
            }
        }
        return maxID;
    }
}
