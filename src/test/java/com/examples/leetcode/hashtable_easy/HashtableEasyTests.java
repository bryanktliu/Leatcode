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
}
