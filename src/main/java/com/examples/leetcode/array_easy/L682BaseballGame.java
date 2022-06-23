package com.examples.leetcode.array_easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class L682BaseballGame {

    public int calPoints(String[] ops) {
        int[] record = new int[1001];
        int index = 0;
        int sum = 0;
        for (String op : ops) {
            switch (op) {
                case "C":
                    sum -= record[index - 1];
                    --index;
                    break;
                case "D":
                    record[index] = record[index - 1] * 2;
                    sum += record[index];
                    ++index;
                    break;
                case "+":
                    record[index] = record[index - 1] + record[index - 2];
                    sum += record[index];
                    ++index;
                    break;
                default:
                    record[index] = Integer.parseInt(op);
                    sum += record[index];
                    ++index;
                    break;
            }
        }
        return sum;
    }
}
