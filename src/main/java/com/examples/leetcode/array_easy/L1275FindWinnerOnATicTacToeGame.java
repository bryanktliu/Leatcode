package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/ */
public class L1275FindWinnerOnATicTacToeGame {

    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        int index = 0;
        for (int[] row : moves) {
            if (index % 2 == 0) {
                board[row[0]][row[1]] = 'A';
            } else {
                board[row[0]][row[1]] = 'B';
            }
            ++index;
        }
        for (char[] row : board) {
            if (row[0] != 0 && row[0] == row[1] && row[0] == row[2]) {
                return String.valueOf(row[0]);
            }
        }
        for (int i = 0; i < 3; ++i) {
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return String.valueOf(board[0][i]);
            }
        }
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return String.valueOf(board[0][0]);
        }
        if (board[2][0] != 0 && board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
            return String.valueOf(board[2][0]);
        }
        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }
}
