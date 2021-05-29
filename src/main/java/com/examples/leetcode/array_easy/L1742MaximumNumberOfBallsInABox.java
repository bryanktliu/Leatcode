package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-number-of-balls-in-a-box/ */
public class L1742MaximumNumberOfBallsInABox {

    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[46];
        for (int i = lowLimit; i < highLimit + 1; ++i) {
            ++count[digitSum(i)];
        }
        int largest = 0;
        for (int value : count) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public int digitSum(int num) {
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        return sum + num;
    }
}
