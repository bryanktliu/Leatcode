package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/calculate-amount-paid-in-taxes/ */
public class L2303CalculateAmountPaidInTaxes {

    public double calculateTax(int[][] brackets, int income) {
        if (brackets[0][0] >= income) {
            return income * brackets[0][1] / 100.0;
        }
        double tax = brackets[0][0] * brackets[0][1] / 100.0;
        income -= brackets[0][0];
        for (int i = 1; i < brackets.length; ++i) {
            int dif = brackets[i][0] - brackets[i - 1][0];
            tax += Math.min(income, dif) * brackets[i][1] / 100.0;
            if (dif > income) {
                break;
            }
            income -= dif;
        }
        return tax;
    }
}
