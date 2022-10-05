package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/ */
public class L2037MinimumNumberOfMovesToSeatEveryone {

    public int minMovesToSeat(int[] seats, int[] students) {
        int[] seatsPos = new int[101];
        for (int seat : seats) {
            ++seatsPos[seat];
        }
        int[] studentsPos = new int[101];
        for (int student : students) {
            ++studentsPos[student];
        }
        int placed = 0;
        int i = 0;
        int j = 0;
        int moves = 0;
        while (placed < seats.length) {
            while (seatsPos[i] == 0) {
                ++i;
            }
            --seatsPos[i];
            while (studentsPos[j] == 0) {
                ++j;
            }
            --studentsPos[j];
            moves += Math.abs(i - j);
            ++placed;
        }
        return moves;
    }
}
