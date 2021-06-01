package com.examples.leetcode.hashtable_easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HashtableEasyTests {

    @Test
    public void testL136SingleNumber() {
        int[] nums = {2, 2, 1};
        int res = new L136SingleNumber().singleNumber(nums);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL202HappyNumber() {
        int n = 2;
        boolean res = new L202HappyNumber().isHappy(n);
        Assert.assertEquals(res, false);
    }

    @Test
    public void testL204CountPrimes() {
        int n = 10;
        int res = new L204CountPrimes().countPrimes(n);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void testL205IsomorphicStrings() {
        String s = "foo";
        String t = "bar";
        boolean res = new L205IsomorphicStrings().isIsomorphic(s, t);
        Assert.assertEquals(res, false);
    }

    @Test
    public void testL242ValidAnagram() {
        String s = "zlap";
        String t = "kcqx";
        boolean res = new L242ValidAnagram().isAnagram(s, t);
        Assert.assertEquals(res, false);
    }

    @Test
    public void testL290WordPattern() {
        String s = "abba";
        String t = "dog cat cat fish";
        boolean res = new L290WordPattern().wordPattern(s, t);
        Assert.assertEquals(res, false);
    }
}
