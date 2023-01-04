package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/determine-if-two-events-have-conflict/ */
public class L2446DetermineIfTwoEventsHaveConflict {

    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[0].compareTo(event2[1]) > 0 || event1[1].compareTo(event2[0]) < 0);
    }
}
