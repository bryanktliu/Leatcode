package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/available-captures-for-rook/ */
public class L999AvailableCapturesForRook {

    public int numRookCaptures(char[][] board) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        int count = 0;
        // up
        for (int i = row - 1; i >= 0; --i) {
            if (board[i][col] == 'p') {
                ++count;
                break;
            } else if (board[i][col] != '.') {
                break;
            }
        }
        // down
        for (int i = row + 1; i < board.length; ++i) {
            if (board[i][col] == 'p') {
                ++count;
                break;
            } else if (board[i][col] != '.') {
                break;
            }
        }
        // left
        for (int i = col - 1; i >= 0; --i) {
            if (board[row][i] == 'p') {
                ++count;
                break;
            } else if (board[row][i] != '.') {
                break;
            }
        }
        // right
        for (int i = col + 1; i < board[0].length; ++i) {
            if (board[row][i] == 'p') {
                ++count;
                break;
            } else if (board[row][i] != '.') {
                break;
            }
        }
        return count;
    }
}
