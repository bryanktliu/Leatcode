package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/min-cost-climbing-stairs/ */
public class L746MinCostClimbingStairs {

    private int[] costs;

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length - 1;
        costs = new int[cost.length];
        Arrays.fill(costs, -1);
        int cost1 = getCost(cost, n);
        int cost2 = getCost(cost, n - 1);
        return Math.min(cost1, cost2);
    }

    public int getCost(int[] cost, int n) {
        if (n < 2) {
            return cost[n];
        }
        if (costs[n - 1] == -1) {
            costs[n - 1] = getCost(cost, n - 1);
        }
        if (costs[n - 2] == -1) {
            costs[n - 2] = getCost(cost, n - 2);
        }
        return cost[n] + Math.min(costs[n - 1], costs[n - 2]);
    }
}
