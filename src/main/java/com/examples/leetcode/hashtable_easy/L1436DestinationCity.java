package com.examples.leetcode.hashtable_easy;

import java.util.HashSet;
import java.util.List;

/** https://leetcode.com/problems/destination-city/ */
public class L1436DestinationCity {

    public String destCity(List<List<String>> paths) {
        HashSet<String> places = new HashSet<>();
        for (List<String> path : paths) {
            places.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!places.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return null;
    }
}
