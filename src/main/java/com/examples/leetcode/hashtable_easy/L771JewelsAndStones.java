package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/jewels-and-stones/ */
public class L771JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewel = new boolean[256];
        char[] types = jewels.toCharArray();
        for (char type : types) {
            jewel[type] = true;
        }
        int count = 0;
        char[] collection = stones.toCharArray();
        for (char c : collection) {
            if (jewel[c]) {
                ++count;
            }
        }
        return count;
    }
}
