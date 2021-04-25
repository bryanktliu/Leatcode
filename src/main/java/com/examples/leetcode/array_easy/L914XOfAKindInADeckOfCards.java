package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/ */
public class L914XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int card : deck) {
            ++count[card];
        }
        int gcd = 0;
        for (int value : count) {
            if (value != 0) {
                gcd = gcd(gcd, value);
            }
        }
        return gcd > 1;
    }

    public int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
