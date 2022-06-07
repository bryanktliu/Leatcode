package com.examples.leetcode.array_medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayMediumTests {

    @Test
    public void testL665NonDecreasingArray() {
        int[] nums = {4, 2, 1};
        boolean res = new L665NonDecreasingArray().checkPossibility(nums);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1170CompareStringsByFrequency() {
        String[] queries = {"cbd"};
        String[] words = {"zaaaz"};
        int[] res = new L1170CompareStringsByFrequency().numSmallerByFrequency(queries, words);
        int[] expected = {1};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2202MaximizeTheTopmostElementAfterKMoves() {
        int[] nums = {2};
        int k = 1;
        int res = new L2202MaximizeTheTopmostElementAfterKMoves().maximumTop(nums, k);
        int expected = -1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2280MinimumLinesToRepresentALineChart() {
        int[][] stockPrices = {{3, 4}, {1, 2}, {7, 8}, {2, 3}};
        int res = new L2280MinimumLinesToRepresentALineChart().minimumLines(stockPrices);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }
}
