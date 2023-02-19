package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/count-pairs-of-similar-strings/ */
public class L2506CountPairsOfSimilarStrings {

    public int similarPairs(String[] words) {
        int[] arr = new int[words.length];
        for (int i = 0; i < words.length; ++i) {
            int num = 0;
            for (char ch : words[i].toCharArray()) {
                num |= 1 << ch - 'a';
            }
            arr[i] = num;
        }
        int similar = 0;
        for (int i = 0; i < words.length; ++i) {
            for (int j = i + 1; j < words.length; ++j) {
                if (arr[i] == arr[j]) {
                    ++similar;
                }
            }
        }
        return similar;
    }
}
