package com.examples.leetcode.array_easy;

public class L1351CountNegativeNumbersInASortedMatrix {

    /** https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/ */
    public int countNegatives(int[][] grid) {
        int x = grid[0].length;
        int total = grid.length * x;
        for (int[] row : grid) {
            x = binarySearch(row, 0, x);
            if (x == 0) {
                break;
            }
            total -= x;
        }
        return total;
    }

    private int binarySearch(int[] arr, int start, int end) {
        int low = start;
        int high = end - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (arr[mid] < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
