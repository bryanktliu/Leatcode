package com.examples.leetcode.hashtable_easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HashtableEasyTests {

    @Test
    public void testL204CountPrimes() {
        int n = 10;
        int res = new L204CountPrimes().countPrimes(n);
        Assert.assertEquals(res, 4);
    }
}
