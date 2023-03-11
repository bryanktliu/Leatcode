package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/rearrange-characters-to-make-target-string/ */
public class L2287RearrangeCharactersToMakeTargetString {

    public int rearrangeCharacters(String s, String target) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            ++count1[s.charAt(i) - 'a'];
        }
        len = target.length();
        for (int i = 0; i < len; ++i) {
            ++count2[target.charAt(i) - 'a'];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; ++i) {
            if (count2[i] == 0) {
                continue;
            }
            min = Math.min(min, count1[i] / count2[i]);
        }
        return min;
    }
}
