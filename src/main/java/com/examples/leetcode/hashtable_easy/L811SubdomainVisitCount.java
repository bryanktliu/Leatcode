package com.examples.leetcode.hashtable_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** https://leetcode.com/problems/subdomain-visit-count/ */
public class L811SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            int views = 0;
            for (int j = 0; j < cpdomain.length(); ++j) {
                if (cpdomain.charAt(j) == ' ') {
                    views = Integer.parseInt(cpdomain.substring(0, j));
                    String domain = cpdomain.substring(j + 1);
                    map.put(domain, views + map.getOrDefault(domain, 0));
                } else if (cpdomain.charAt(j) == '.') {
                    String domain = cpdomain.substring(j + 1);
                    map.put(domain, views + map.getOrDefault(domain, 0));
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue() + " " + entry.getKey());
        }
        return list;
    }
}
