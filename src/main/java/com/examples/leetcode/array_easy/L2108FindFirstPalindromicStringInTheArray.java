package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-first-palindromic-string-in-the-array/ */
public class L2108FindFirstPalindromicStringInTheArray {

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    public boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
