package com.examples.leetcode.hashtable_easy;

import java.util.HashSet;

public class L929UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        HashSet<String> email = new HashSet<>();
        for (String s : emails) {
            email.add(convertEmail(s));
        }
        return email.size();
    }

    public String convertEmail(String string) {
        StringBuilder newString = new StringBuilder();
        char[] chars = string.toCharArray();
        boolean skip = false;
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == '@') {
                newString.append(string.substring(i));
                return newString.toString();
            } else if (chars[i] != '.' && !skip) {
                if (chars[i] == '+') {
                    skip = true;
                } else {
                    newString.append(chars[i]);
                }
            }
        }
        return newString.toString();
    }
}
