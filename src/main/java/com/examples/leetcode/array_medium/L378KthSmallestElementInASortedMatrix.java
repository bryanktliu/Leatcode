package com.examples.leetcode.array_medium;

/** https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/ */
public class L378KthSmallestElementInASortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int min = matrix[0][0];
        int max = matrix[matrix.length - 1][matrix.length - 1];
        while (min != max) {
            int mid = min + (max - min) / 2;
            int count = countLarger(matrix, mid);
            if (count < k) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    int countLarger(int[][] matrix, int mid) {
        int count = 0;
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] <= mid) {
                count += col + 1;
                ++row;
            } else {
                --col;
            }
        }
        return count;
    }
}
