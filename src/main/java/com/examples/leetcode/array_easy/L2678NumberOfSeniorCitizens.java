package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-senior-citizens/ */
public class L2678NumberOfSeniorCitizens {

    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            int age = detail.charAt(11);
            if (age > '6') {
                ++count;
            } else if (age == '6' && detail.charAt(12) > '0') {
                ++count;
            }
        }
        return count;
    }
}
