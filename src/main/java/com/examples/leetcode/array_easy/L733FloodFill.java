package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/flood-fill/ */
public class L733FloodFill {

    public int[] directionsc = {1, 0, -1, 0};
    public int[] directionsr = {0, 1, 0, -1};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startColor = image[sr][sc];
        if (startColor == newColor) {
            return image;
        }
        bfs(image, sr, sc, newColor, startColor);
        return image;
    }

    public void bfs(int[][] image, int sr, int sc, int newColor, int startColor) {
        image[sr][sc] = newColor;
        for (int i = 0; i < 4; ++i) {
            int newr = sr + directionsr[i];
            int newc = sc + directionsc[i];
            if (newr < image.length
                    && newr >= 0
                    && newc < image[0].length
                    && newc >= 0
                    && image[newr][newc] == startColor) {
                bfs(image, newr, newc, newColor, startColor);
            }
        }
    }
}
