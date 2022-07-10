package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/lemonade-change/ */
public class L860LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int ten = 0;
        int five = 0;
        for (int bill : bills) {
            if (bill == 20) {
                if (ten > 0 && five > 0) {
                    --ten;
                    --five;
                } else if (five > 2) {
                    five -= 3;
                } else {
                    return false;
                }
            } else if (bill == 10) {
                if (five > 0) {
                    --five;
                    ++ten;
                } else {
                    return false;
                }
            } else {
                ++five;
            }
        }
        return true;
    }
}
