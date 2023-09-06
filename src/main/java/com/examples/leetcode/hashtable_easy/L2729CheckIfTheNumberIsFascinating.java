package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/check-if-the-number-is-fascinating/ */
public class L2729CheckIfTheNumberIsFascinating {

    public boolean isFascinating(int n) {
        boolean[] seen = new boolean[10];
        for (int i = 1; i < 4; ++i) {
            int num = n * i;
            while (num > 0) {
                int r = num % 10;
                if (r == 0 || seen[r]) {
                    return false;
                }
                seen[num % 10] = true;
                num /= 10;
            }
        }
        return true;
    }
    //    public boolean isFascinating(int n) {
    //        return n == 192 || n == 219 || n == 273 || n == 327;
    //    }
}
