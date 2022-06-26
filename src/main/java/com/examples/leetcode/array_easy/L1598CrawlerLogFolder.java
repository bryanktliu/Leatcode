package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/crawler-log-folder/ */
public class L1598CrawlerLogFolder {

    public int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (count != 0) {
                    --count;
                }
            } else if (!log.equals("./")) {
                ++count;
            }
        }
        return count;
    }
}
