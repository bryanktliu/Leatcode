package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/odd-string-difference/ */
public class L2451OddStringDifference {

    public String oddString(String[] words) {
        int len = words[0].length();
        for (int i = 1; i < len; ++i) {
            for (int j = 1; j < words.length; ++j) {
                int dif1 = words[j].charAt(i) - words[j].charAt(i - 1);
                int dif2 = words[j - 1].charAt(i) - words[j - 1].charAt(i - 1);
                if (dif1 != dif2) {
                    if (j == words.length - 1) {
                        if (words[0].charAt(i) - words[0].charAt(i - 1) != dif1) {
                            return words[j];
                        }
                        return words[j - 1];
                    }
                    if (words[j + 1].charAt(i) - words[j + 1].charAt(i - 1) != dif1) {
                        return words[j];
                    }
                    return words[j - 1];
                }
            }
        }
        return null;
    }
}
