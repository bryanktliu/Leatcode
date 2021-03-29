package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/reshape-the-matrix/ */
public class L566ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r == nums.length && c == nums[0].length || nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] ret = new int[r][c];
        int x = 0;
        int y = 0;
        for (int[] row : nums) {
            for (int i : row) {
                ret[x][y] = i;
                if (++y >= c) {
                    y = 0;
                    ++x;
                }
            }
        }
        return ret;
    }
}
