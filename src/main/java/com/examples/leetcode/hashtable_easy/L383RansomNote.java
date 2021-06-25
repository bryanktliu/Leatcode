package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/ransom-note/ */
public class L383RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int maglen = magazine.length();
        int notelen = ransomNote.length();
        if (maglen < notelen) {
            return false;
        }
        int[] chars = new int[26];
        for (int i = 0; i < maglen; ++i) {
            ++chars[magazine.charAt(i) - 'a'];
        }
        for (int i = 0; i < notelen; ++i) {
            int c = ransomNote.charAt(i) - 'a';
            if (chars[c] == 0) {
                return false;
            }
            --chars[c];
        }
        return true;
    }
}
