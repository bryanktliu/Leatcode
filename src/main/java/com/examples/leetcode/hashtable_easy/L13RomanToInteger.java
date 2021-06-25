package com.examples.leetcode.hashtable_easy;

/** https://leetcode.com/problems/roman-to-integer/ */
public class L13RomanToInteger {

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int last = 0;
        int sum = 0;
        int current = 0;
        for (int i = chars.length - 1; i >= 0; --i) {
            switch (chars[i]) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
            }
            if (last > current) {
                sum -= current;
            } else {
                sum += current;
            }
            last = current;
        }
        return sum;
    }
}
