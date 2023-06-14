package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/ */
public class L2660DetermineTheWinnerOfABowlingGame {

    public int isWinner(int[] player1, int[] player2) {
        int p1 = countPoints(player1);
        int p2 = countPoints(player2);
        if (p1 > p2) {
            return 1;
        }
        if (p1 < p2) {
            return 2;
        }
        return 0;
    }

    public int countPoints(int[] player) {
        int bonus = 0;
        int total = 0;
        for (int round : player) {
            if (bonus > 0) {
                --bonus;
                total += round;
            }
            total += round;
            if (round == 10) {
                bonus = 2;
            }
        }
        return total;
    }
}
