package com.examples.leetcode.array_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public void testL31NextPermutation() {
        int[] nums = {1, 2, 3};
        new L31NextPermutation().nextPermutation(nums);
        int[] expected = {1, 3, 2};
        Assert.assertEquals(nums, expected);
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
    public void testL46Permutations() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = new L46Permutations().permute(nums);
        int[][] res = new int[list.size()][nums.length];
        for (int i = 0; i < list.size(); ++i) {
            List<Integer> temp = list.get(i);
            for (int j = 0; j < nums.length; ++j) {
                res[i][j] = temp.get(j);
            }
        }
        int[][] expected = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL55JumpGame() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean res = new L55JumpGame().canJump(nums);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL64MinimumPathSum() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int res = new L64MinimumPathSum().minPathSum(grid);
        int expected = 7;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL74SearchA2DMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean res = new L74SearchA2DMatrix().searchMatrix(matrix, target);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL78Subsets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = new L78Subsets().subsets(nums);
        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            List<Integer> temp = list.get(i);
            res[i] = new int[temp.size()];
            for (int j = 0; j < temp.size(); ++j) {
                res[i][j] = temp.get(j);
            }
        }
        int[][] expected = {{1, 2, 3}, {1, 2}, {1, 3}, {1}, {2, 3}, {2}, {3}, {}};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL80RemoveDuplicatesFromSortedArrayII() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int len = new L80RemoveDuplicatesFromSortedArrayII().removeDuplicates(nums);
        int[] res = Arrays.copyOf(nums, len);
        int[] expected = {1, 1, 2, 2, 3};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL120Triangle() {
        List<List<Integer>> triangle =
                Arrays.asList(
                        Collections.singletonList(2),
                        Arrays.asList(3, 4),
                        Arrays.asList(6, 5, 7),
                        Arrays.asList(4, 1, 8, 3));
        int res = new L120Triangle().minimumTotal(triangle);
        int expected = 11;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL139WordBreak() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean res = new L139WordBreak().wordBreak(s, wordDict);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL179LargestNumber() {
        int[] nums = {10, 2};
        String res = new L179LargestNumber().largestNumber(nums);
        String expected = "210";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL198HouseRobber() {
        int[] nums = {1, 2, 3, 1};
        int res = new L198HouseRobber().rob(nums);
        int expected = 4;
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
    public void testL238ProductOfArrayExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        int[] res = new L238ProductOfArrayExceptSelf().productExceptSelf(nums);
        int[] expected = {24, 12, 8, 6};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL215KthLargestElementInAnArray() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int res = new L215KthLargestElementInAnArray().findKthLargest(nums, k);
        int expected = 5;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL274HIndex() {
        int[] citations = {3, 0, 6, 1, 5};
        int res = new L274HIndex().hIndex(citations);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL287FindTheDuplicateNumber() {
        int[] nums = {1, 3, 4, 2, 2};
        int res = new L287FindTheDuplicateNumber().findDuplicate(nums);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL347TopKFrequentElements() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] res = new L347TopKFrequentElements().topKFrequent(nums, k);
        int[] expected = {1, 2};
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
    public void testL986IntervalListIntersections() {
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] res =
                new L986IntervalListIntersections().intervalIntersection(firstList, secondList);
        int[][] expected = {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
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

    @Test
    public void testL2610ConvertAnArrayIntoA2DArrayWithConditions() {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> list =
                new L2610ConvertAnArrayIntoA2DArrayWithConditions().findMatrix(nums);
        int[][] res =
                list.stream()
                        .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                        .toArray(int[][]::new);
        int[][] expected = {{1, 2, 3, 4}, {1, 3}, {1}};
        Assert.assertTrue(Arrays.deepEquals(res, expected));
    }

    @Test
    public void testL2740FindTheValueOfThePartition() {
        int[] nums = {1, 3, 2, 4};
        int res = new L2740FindTheValueOfThePartition().findValueOfPartition(nums);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }
}
