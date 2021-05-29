package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/ */
public class L1700NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int student : students) {
            ++count[student];
        }
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                if (sandwich == 0) {
                    return count[1];
                } else {
                    return count[0];
                }
            }
            --count[sandwich];
        }
        return 0;
    }
}
