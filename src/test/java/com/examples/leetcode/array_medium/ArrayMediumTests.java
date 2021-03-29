package com.examples.leetcode.array_medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayMediumTests {

    @Test
    public void testL1170CompareStringsByFrequency() {
        String[] queries = {"cbd"};
        String[] words = {"zaaaz"};
        int[] res = new L1170CompareStringsByFrequency().numSmallerByFrequency(queries, words);
        int[] expected = {1};
        Assert.assertEquals(res, expected);
    }
}
