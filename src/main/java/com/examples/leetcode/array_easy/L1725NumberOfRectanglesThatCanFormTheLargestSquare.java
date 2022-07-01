package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/ */
public class L1725NumberOfRectanglesThatCanFormTheLargestSquare {

    public int countGoodRectangles(int[][] rectangles) {
        int largest = 0;
        int countLargest = 0;
        for (int[] rectangle : rectangles) {
            int square = Math.min(rectangle[0], rectangle[1]);
            if (square > largest) {
                largest = square;
                countLargest = 1;
            } else if (square == largest) {
                ++countLargest;
            }
        }
        return countLargest;
    }
}
