package com.examples.leetcode.array_medium;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayMediumTests {

    @Test
    public void testL11ContainerWithMostWater() {
        int[] height = {1, 1};
        int res = new L11ContainerWithMostWater().maxArea(height);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL15ThreeSum() {
        int[] nums = {0};
        List<List<Integer>> res = new L15ThreeSum().threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL16ThreeSumClosest() {
        int[] nums = {1, 1, -1, -1, 3};
        int target = -1;
        int res = new L16ThreeSumClosest().threeSumClosest(nums, target);
        int expected = -1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL33SearchInRotatedSortedArray() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int res = new L33SearchInRotatedSortedArray().search(nums, target);
        int expected = -1;
        Assert.assertEquals(res, expected);
    }


    @Test
    public void testL220ContainsDuplicateIII() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int k = 2;
        int t = 3;
        boolean res = new L220ContainsDuplicateIII().containsNearbyAlmostDuplicate(nums, k, t);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

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
