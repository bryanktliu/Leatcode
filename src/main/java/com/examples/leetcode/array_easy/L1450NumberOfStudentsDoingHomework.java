package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/ */
public class L1450NumberOfStudentsDoingHomework {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int column = startTime.length;
        int count = 0;
        for (int i = 0; i < column; ++i) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                ++count;
            }
        }
        return count;
    }
}
