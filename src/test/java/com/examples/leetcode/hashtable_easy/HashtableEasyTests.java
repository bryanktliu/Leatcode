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

    @Test
    public void testL349IntersectionOfTwoArrays() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] res = new L349IntersectionOfTwoArrays().intersection(nums1, nums2);
        Assert.assertEquals(res, new int[] {9, 4});
    }

    @Test
    public void testL350IntersectionOfTwoArrays2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] res = new L350IntersectionOfTwoArrays2().intersect(nums1, nums2);
        Assert.assertEquals(res, new int[] {9, 4});
    }

    @Test
    public void testL387FirstUniqueCharacterInAString() {
        String s = "loveleetcode";
        int res = new L387FirstUniqueCharacterInAString().firstUniqChar(s);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL389FindTheDifference() {
        String s = "";
        String t = "y";
        int res = new L389FindTheDifference().findTheDifference(s, t);
        Assert.assertEquals(res, 'y');
    }
}
