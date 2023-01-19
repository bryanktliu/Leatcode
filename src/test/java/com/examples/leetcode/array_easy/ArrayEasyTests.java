package com.examples.leetcode.array_easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayEasyTests {

    @Test
    public void testL1TwoSum() {
        int[] nums = {2, 7, 11, 15};
        int[] res = new L1TwoSum().twoSum(nums, 9);
        int[] expected = {0, 1};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL26RemoveDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = new L26RemoveDuplicates().removeDuplicates(nums);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testL27RemoveElement() {
        int[] nums = {3, 2, 2, 3};
        int res = new L27RemoveElement().removeElement(nums, 3);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL35SearchInsertPosition() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int res = new L35SearchInsertPosition().searchInsert(nums, target);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void testL53MaximumSubarray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = new L53MaximumSubarray().maxSubArray(nums);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testL66PlusOne() {
        int[] nums = {8, 9, 9, 9};
        int[] res = new L66PlusOne().plusOne(nums);
        int[] expected = {9, 0, 0, 0};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL88MergeSortedArray() {
        int[] arr1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[] {2, 5, 6};
        new L88MergeSortedArray().merge(arr1, 3, arr2, 3);
        int[] expected = {1, 2, 2, 3, 5, 6};
        Assert.assertEquals(arr1, expected);
    }

    @Test
    public void testL118PascalTriangle() {
        List<List<Integer>> list = new L118PascalTriangle().pascalTriangle(5);
        int[] res = list.get(list.size() - 1).stream().mapToInt(Integer::intValue).toArray();
        int[] expected = {1, 4, 6, 4, 1};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL119PascalTriangle2() {
        int rowIndex = 0;
        List<Integer> list = new L119PascalTriangle2().getRow(rowIndex);
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        int[] expected = {1};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL121BestTimeToBuyAndSellStock() {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int res = new L121BestTimeToBuyAndSellStock().maxProfit(nums);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testL122BestTimeToBuyAndSellStock2() {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int res = new L122BestTimeToBuyAndSellStock2().maxProfit(nums);
        Assert.assertEquals(res, 7);
    }

    @Test
    public void testL167TwoSum2() {
        int[] nums = {2, 7, 11, 15};
        int[] res = new L167TwoSum2().twoSum(nums, 9);
        int[] expected = {1, 2};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL217ContainsDuplicate() {
        int[] nums = {1, 2, 3, 1};
        boolean res = new L217ContainsDuplicate().containsDuplicate(nums);
        Assert.assertTrue(res);
    }

    @Test
    public void testL219ContainsDuplicate2() {
        int[] nums = {1, 2, 3, 1};
        boolean res = new L219ContainsDuplicate2().containsNearbyDuplicate(nums, 3);
        Assert.assertTrue(res);
    }

    @Test
    public void testL228SumaryRanges() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> res = new L228SumaryRanges().summaryRanges(nums);
        List<String> expected = Arrays.asList("0", "2->4", "6", "8->9");
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL268MissingNumber() {
        int[] nums = {3, 0, 1};
        int res = new L268MissingNumber().missingNumber(nums);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL283MoveZeros() {
        int[] nums = {0, 1, 0, 3, 12};
        new L283MoveZeros().moveZeroes(nums);
        int[] expected = {1, 3, 12, 0, 0};
        Assert.assertEquals(nums, expected);
    }

    @Test
    public void testL414ThirdMaxNumber() {
        int[] nums = {3, 2, 1};
        int res = new L414ThirdMaxNumber().thirdMax(nums);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL448FindAllNumbersDisappeared() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> res = new L448FindAllNumbersDisappeared().findDisappearedNumbers(nums);
        List<Integer> expected = Arrays.asList(5, 6);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL455AssignCookies() {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int res = new L455AssignCookies().findContentChildren(g, s);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL485MaxConsecutiveOnes() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int res = new L485MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void testL495TeemoAttacking() {
        int[] timeSeries = {1, 2};
        int duration = 2;
        int res = new L495TeemoAttacking().findPoisonedDuration(timeSeries, duration);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void testL506RelativeRanks() {
        int[] score = {10, 3, 8, 9, 4};
        String[] res = new L506RelativeRanks().findRelativeRanks(score);
        String[] expected = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL509FibonacciNumber() {
        int res = new L509FibonacciNumber().fib(4);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void testL561ArrayPartition() {
        int[] nums = {1, 4, 3, 2};
        int res = new L561ArrayPartition().arrayPairSum(nums);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void testL566ReshapeMatrix() {
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] res = new L566ReshapeTheMatrix().matrixReshape(nums, 1, 4);
        int[] expected = {1, 2, 3, 4};
        Assert.assertEquals(res[0], expected);
    }

    @Test
    public void testL605CanPlaceFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean res = new L605CanPlaceFlowers().canPlaceFlowers(flowerbed, n);
        Assert.assertFalse(res);
    }

    @Test
    public void testL628MaximumProductOfThreeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        int res = new L628MaximumProductOfThreeNumbers().maximumProduct(nums);
        Assert.assertEquals(res, -6);
    }

    @Test
    public void testL643MaximumAverageSubarrayI() {
        int[] nums = {5};
        int k = 1;
        double res = new L643MaximumAverageSubarrayI().findMaxAverage(nums, k);
        double expected = 5;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL661ImageSmoother() {
        int[][] nums = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] res = new L661ImageSmoother().imageSmoother(nums);
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Assert.assertTrue(Arrays.deepEquals(res, expected));
    }

    @Test
    public void testL674LongestContinuousIncreasingSubsequence() {
        int[] nums = {1, 3, 5, 4, 7};
        int res = new L674LongestContinuousIncreasingSubsequence().findLengthOfLCIS(nums);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL682BaseballGame() {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int res = new L682BaseballGame().calPoints(ops);
        int expected = 27;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL697DegreeOfAnArray() {
        int[] nums = {1, 2, 2, 3, 1};
        int res = new L697DegreeOfAnArray().findShortestSubArray(nums);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL704BinarySearch() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int res = new L704BinarySearch().search(nums, target);
        int expected = -1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL717OneBitAndTwoBitCharacters() {
        int[] nums = {1, 0, 0};
        boolean res = new L717OneBitAndTwoBitCharacters().isOneBitCharacter(nums);
        Assert.assertTrue(res);
    }

    @Test
    public void testL724FindPivotIndex() {
        int[] nums = {1, 2, 3};
        int res = new L724FindPivotIndex().pivotIndex(nums);
        Assert.assertEquals(res, -1);
    }

    @Test
    public void testL733FloodFill() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 0;
        int sc = 0;
        int newColor = 2;
        int[][] res = new L733FloodFill().floodFill(image, sr, sc, newColor);
        Assert.assertEquals(res, new int[][] {{2, 2, 2}, {2, 2, 2}});
    }

    @Test
    public void testL744FindSmallestLetterGreaterThanTarget() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char res =
                new L744FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, target);
        char expected = 'f';
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL746MinCostClimbingStairs() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int res = new L746MinCostClimbingStairs().minCostClimbingStairs(cost);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testL747LargestNumberAtLeastTwiceOfOthers() {
        int[] nums = {3, 6, 1, 0};
        int res = new L747LargestNumberAtLeastTwiceOfOthers().dominantIndex(nums);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL766ToeplitzMatrix() {
        int[][] nums = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        boolean res = new L766ToeplitzMatrix().isToeplitzMatrix(nums);
        Assert.assertTrue(res);
    }

    @Test
    public void testL806NumberOfLinesToWriteString() {
        int[] widths = {
            4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10, 10, 10
        };
        String s = "bbbcccdddaaa";
        int[] res = new L806NumberOfLinesToWriteString().numberOfLines(widths, s);
        int[] expected = {2, 4};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL812LargestTriangleArea() {
        int[][] points = {{1, 0}, {0, 0}, {0, 1}};
        double res = new L812LargestTriangleArea().largestTriangleArea(points);
        double expected = 0.50000;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL821ShortestDistanceToACharacter() {
        String s = "aaab";
        char c = 'b';
        int[] res = new L821ShortestDistanceToACharacter().shortestToChar(s, c);
        int[] expected = new int[] {3, 2, 1, 0};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL830PositionsOfLargeGroups() {
        String s = "abbxxxxzzy";
        List<List<Integer>> list = new L830PositionsOfLargeGroups().largeGroupPositions(s);
        int[] res = list.get(0).stream().mapToInt(Integer::intValue).toArray();
        int[] expected = {3, 6};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL832FlippingAnImage() {
        int[][] nums = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] res = new L832FlippingAnImage().flipAndInvertImage(nums);
        int[][] expected = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        Assert.assertTrue(Arrays.deepEquals(res, expected));
    }

    @Test
    public void testL860LemonadeChange() {
        int[] bills = {5, 5, 10, 10, 20};
        boolean res = new L860LemonadeChange().lemonadeChange(bills);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL867TransposeMatrix() {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = new L867TransposeMatrix().transpose(nums);
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Assert.assertTrue(Arrays.deepEquals(res, expected));
    }

    @Test
    public void testL888FairCandySwap() {
        int[] arr1 = {1, 1};
        int[] arr2 = {2, 2};
        int[] res = new L888FairCandySwap().fairCandySwap(arr1, arr2);
        int[] expected = {1, 2};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL892SurfaceAreaOf3DShapes() {
        int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int res = new L892SurfaceAreaOf3DShapes().surfaceArea(grid);
        int expected = 32;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL896MonotonicArray() {
        int[] nums = {1, 2, 2, 3};
        boolean res = new L896MonotonicArray().isMonotonic(nums);
        Assert.assertTrue(res);
    }

    @Test
    public void testL905SortArrayByParity() {
        int[] nums = {3, 1, 2, 4};
        int[] res = new L905SortArrayByParity().sortArrayByParity(nums);
        int[] expected = {4, 2, 1, 3};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL908SmallestRangeI() {
        int[] nums = {0, 10};
        int k = 2;
        int res = new L908SmallestRangeI().smallestRangeI(nums, k);
        int expected = 6;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL914XOfAKindInADeckOfCards() {
        int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};
        boolean res = new L914XOfAKindInADeckOfCards().hasGroupsSizeX(deck);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL922SortArrayByParity2() {
        int[] nums = {4, 2, 5, 7};
        int[] res = new L922SortArrayByParity2().sortArrayByParityII(nums);
        int[] expected = {4, 5, 2, 7};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL941ValidMountainArray() {
        int[] arr = {3, 5, 5};
        boolean res = new L941ValidMountainArray().validMountainArray(arr);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL944DeleteColumnsToMakeSorted() {
        String[] strs = {"a", "b"};
        int res = new L944DeleteColumnsToMakeSorted().minDeletionSize(strs);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL976LargestPerimeterTriangle() {
        int[] nums = {1, 2, 1};
        int res = new L976LargestPerimeterTriangle().largestPerimeter(nums);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL977SquaresOfASortedArray() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] res = new L977SquaresOfASortedArray().sortedSquares(nums);
        int[] expected = {0, 1, 9, 16, 100};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL985SumOfEvenNumbersAfterQueries() {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] res = new L985SumOfEvenNumbersAfterQueries().sumEvenAfterQueries(nums, queries);
        int[] expected = {8, 6, 2, 4};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL989AddToArrayFormOfInteger() {
        int[] num = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
        int k = 516;
        List<Integer> res = new L989AddToArrayFormOfInteger().addToArrayForm(num, k);
        List<Integer> expected =
                Arrays.asList(1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 5, 7, 9);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL999AvailableCapturesForRook() {
        char[][] nums = {
            {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'},
            {'.', '.', '.', 'R', '.', '.', '.', 'p'}, {'.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        int res = new L999AvailableCapturesForRook().numRookCaptures(nums);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void testL1002FindCommonCharacters() {
        String[] nums = {"bella", "label", "roller"};
        List<String> res = new L1002FindCommonCharacters().commonChars(nums);
        List<String> expected = Arrays.asList("e", "l", "l");
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1005MaximizeSumOfArrayAfterKNegations() {
        int[] nums = {3, -1, 0, 2};
        int k = 3;
        int res = new L1005MaximizeSumOfArrayAfterKNegations().largestSumAfterKNegations(nums, k);
        int expected = 6;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1018BinaryPrefixDivisibleBy5() {
        int[] nums = {
            0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1
        };
        List<Boolean> res = new L1018BinaryPrefixDivisibleBy5().prefixesDivBy5(nums);
        List<Boolean> expected =
                Arrays.asList(
                        true, false, false, true, true, true, false, false, false, false, false,
                        false, false, false, false, true, true, false, false, false, false, false,
                        false, false, false, false, false, false, true);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1037ValidBoomerang() {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        boolean res = new L1037ValidBoomerang().isBoomerang(points);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1046LastStoneWeight() {
        int[] stones = {1};
        int res = new L1046LastStoneWeight().lastStoneWeight(stones);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1051HeightChecker() {
        int[] nums = {1, 1, 4, 2, 1, 3};
        int res = new L1051HeightChecker().heightChecker(nums);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void testL1089DuplicateZeros() {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        new L1089DuplicateZeros().duplicateZeros(nums);
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        Assert.assertEquals(nums, expected);
    }

    @Test
    public void L1013PartitionArrayIntoThreePartsWithEqualSum() {
        int[] arr = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        boolean res =
                new L1013PartitionArrayIntoThreePartsWithEqualSum().canThreePartsEqualSum(arr);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1122RelativeSortArray() {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] res = new L1122RelativeSortArray().relativeSortArray(arr1, arr2);
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1128NumberOfEquivalentDominoPairs() {
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        int res = new L1128NumberOfEquivalentDominoPairs().numEquivDominoPairs(dominoes);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1160FindWordsThatCanBeFormedByCharacters() {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int res = new L1160FindWordsThatCanBeFormedByCharacters().countCharacters(words, chars);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testL1184DistanceBetweenBusStops() {
        int[] nums = {1, 2, 3, 4};
        int res = new L1184DistanceBetweenBusStops().distanceBetweenBusStops(nums, 0, 1);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL1200MinimumAbsoluteDifference() {
        int[] nums = {4, 2, 1, 3};
        List<List<Integer>> res = new L1200MinimumAbsoluteDifference().minimumAbsDifference(nums);
        List<Integer> expected = Arrays.asList(3, 4);
        Assert.assertEquals(res.get(2), expected);
    }

    @Test
    public void testL1207UniqueNumberOfOccurrences() {
        int[] arr = {1, 2};
        boolean res = new L1207UniqueNumberOfOccurrences().uniqueOccurrences(arr);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1217MinimumCostToMoveChipsToTheSamePosition() {
        int[] nums = {1, 2, 3};
        int res = new L1217MinimumCostToMoveChipsToTheSamePosition().minCostToMoveChips(nums);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL1232CheckIfItIsAStraightLine() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean res = new L1232CheckIfItIsAStraightLine().checkStraightLine(coordinates);
        Assert.assertTrue(res);
    }

    @Test
    public void testL1252CellsWithOddValuesInAMatrix() {
        int[][] nums = {{0, 1}, {1, 1}};
        int res = new L1252CellsWithOddValuesInAMatrix().oddCells(2, 3, nums);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testL1260Shift2dGrid() {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<List<Integer>> res = new L1260Shift2dGrid().shiftGrid(nums, 1);
        List<Integer> expected = Arrays.asList(9, 1, 2);
        Assert.assertEquals(res.get(0), expected);
    }

    @Test
    public void testL1266MinimumTimeVisitingAllPoints() {
        int[][] nums = {{1, 1}, {3, 4}, {-1, 0}};
        int res = new L1266MinimumTimeVisitingAllPoints().minTimeToVisitAllPoints(nums);
        Assert.assertEquals(res, 7);
    }

    @Test
    public void testL1275FindWinnerOnATicTacToeGame() {
        int[][] nums = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        String res = new L1275FindWinnerOnATicTacToeGame().tictactoe(nums);
        Assert.assertEquals(res, "A");
    }

    @Test
    public void testL1287ElementAppearingMoreThan25InSortedArray() {
        int[] nums = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int res = new L1287ElementAppearingMoreThan25InSortedArray().findSpecialInteger(nums);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testL1295FindNumbersWithEvenNumberOfDigits() {
        int[] nums = {12, 345, 2, 6, 7896};
        int res = new L1295FindNumbersWithEvenNumberOfDigits().findNumbers(nums);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL1299ReplaceElementsWithGreatestElementOnRightSide() {
        int[] nums = {17, 18, 5, 4, 6, 1};
        int[] res = new L1299ReplaceElementsWithGreatestElementOnRightSide().replaceElements(nums);
        int[] expected = {18, 6, 6, 6, 1, -1};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1304FindNUniqueIntegersSumUpToZero() {
        int[] res = new L1304FindNUniqueIntegersSumUpToZero().sumZero(5);
        int sum = 0;
        for (int i : res) {
            sum += i;
        }
        Assert.assertEquals(sum, 0);
    }

    @Test
    public void testL1331RankTransformOfAnArray() {
        int[] nums = {40, 10, 20, 30};
        int[] res = new L1331RankTransformOfAnArray().arrayRankTransform(nums);
        int[] expected = {4, 1, 2, 3};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1337TheKWeakestRowsInAMatrix() {
        int[][] nums = {
            {1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}
        };
        int[] res = new L1337TheKWeakestRowsInAMatrix().kWeakestRows(nums, 3);
        int[] expected = {2, 0, 3};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1346CheckIfNAndItsDoubleExist() {
        int[] nums = {-2, 0, 10, -19, 4, 6, -8};
        boolean res = new L1346CheckIfNAndItsDoubleExist().checkIfExist(nums);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1351CountNegativeNumbersInASortedMatrix() {
        int[][] nums = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int res = new L1351CountNegativeNumbersInASortedMatrix().countNegatives(nums);
        Assert.assertEquals(res, 8);
    }

    @Test
    public void testL1356SortIntegersByTheNumberOf1Bits() {
        int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] res = new L1356SortIntegersByTheNumberOf1Bits().sortByBits(arr);
        int[] expected = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1380LuckyNumbersInAMatrix() {
        int[][] nums = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> res = new L1380LuckyNumbersInAMatrix().luckyNumbers(nums);
        List<Integer> expected = Collections.singletonList(15);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1385FindTheDistanceValueBetweenTwoArrays() {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int res =
                new L1385FindTheDistanceValueBetweenTwoArrays().findTheDistanceValue(arr1, arr2, 2);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL1394FindLuckyIntegerInAnArray() {
        int[] nums = {2, 2, 3, 4};
        int res = new L1394FindLuckyIntegerInAnArray().findLucky(nums);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL1399CountLargestGroup() {
        int res = new L1399CountLargestGroup().countLargestGroup(13);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void testL1413MinimumValueToGet() {
        int[] nums = {-3, 2, -3, 4, 2};
        int res = new L1413MinimumValueToGet().minStartValue(nums);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testL1431KidsWithTheGreatestNumberOfCandies() {
        int[] nums = {2, 3, 5, 1, 3};
        List<Boolean> res = new L1431KidsWithTheGreatestNumberOfCandies().greatestCandies(nums, 3);
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1437CheckIfAll1sAreAtLeastLengthKPlacesAway() {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
        boolean res = new L1437CheckIfAll1sAreAtLeastLengthKPlacesAway().kLengthApart(nums, k);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1441BuildAnArrayWithStackOperations() {
        int[] target = {1, 2, 3};
        int n = 3;
        List<String> res = new L1441BuildAnArrayWithStackOperations().buildArray(target, n);
        List<String> expected = Arrays.asList("Push", "Push", "Push");
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1450NumberOfStudentsDoingHomework() {
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int res = new L1450NumberOfStudentsDoingHomework().busyStudent(startTime, endTime, 4);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL1460MakeTwoArraysEqual() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 1, 3};
        boolean res = new L1460MakeTwoArraysEqual().canBeEqual(arr1, arr2);
        Assert.assertTrue(res);
    }

    @Test
    public void testL1464MaximumProductOfTwoElements() {
        int[] nums = {3, 4, 5, 2};
        int res = new L1464MaximumProductOfTwoElements().maxProduct(nums);
        Assert.assertEquals(res, 12);
    }

    @Test
    public void testL1475FinalPricesWithASpecialDiscount() {
        int[] nums = {8, 4, 6, 2, 3};
        int[] res = new L1475FinalPricesWithASpecialDiscount().finalPrices(nums);
        int[] expected = {4, 2, 4, 2, 3};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1480RunningSumOf1dArray() {
        int[] nums = {1, 2, 3, 4};
        int[] res = new L1480RunningSumOf1dArray().runningSum(nums);
        int[] expected = {1, 3, 6, 10};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1491AverageSalary() {
        int[] nums = {4000, 3000, 1000, 2000};
        double res = new L1491AverageSalary().average(nums);
        Assert.assertEquals(res, 2500, 0.0001);
    }

    @Test
    public void testL1502CanMakeArithmeticProgression() {
        int[] nums = {3, 5, 1};
        boolean res = new L1502CanMakeArithmeticProgression().canMakeArithmeticProgression(nums);
        Assert.assertFalse(res);
    }

    @Test
    public void testL1528ShuffleString() {
        String s = "abc";
        int[] indices = {0, 1, 2};
        String res = new L1528ShuffleString().restoreString(s, indices);
        String expected = "abc";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1534CountGoodTriplets() {
        int[] nums = {3, 0, 1, 1, 9, 7};
        int res = new L1534CountGoodTriplets().countGoodTriplets(nums, 7, 2, 3);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void testL1539KthMissingPositiveNumber() {
        int[] nums = {2, 3, 4, 7, 11};
        int res = new L1539KthMissingPositiveNumber().findKthPositive(nums, 5);
        Assert.assertEquals(res, 9);
    }

    @Test
    public void testL1550ThreeConsecutiveOdds() {
        int[] nums = {2, 6, 4, 1};
        boolean res = new L1550ThreeConsecutiveOdds().threeConsecutiveOdds(nums);
        Assert.assertFalse(res);
    }

    @Test
    public void testL1560MostVisitedSectorInACircularTrack() {
        int[] nums = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        List<Integer> res = new L1560MostVisitedSectorInACircularTrack().mostVisited(2, nums);
        List<Integer> expected = Collections.singletonList(2);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1566DetectPatternOfLengthMRepeatedKOrMoreTimes() {
        int[] arr = {1, 2, 1, 2, 1, 1, 1, 3};
        int m = 2;
        int k = 2;
        boolean res =
                new L1566DetectPatternOfLengthMRepeatedKOrMoreTimes().containsPattern(arr, m, k);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1572MatrixDiagonalSum() {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res = new L1572MatrixDiagonalSum().diagonalSum(nums);
        Assert.assertEquals(res, 25);
    }

    @Test
    public void testL1582SpecialPositionsInABinaryMatrix() {
        int[][] nums = {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        int res = new L1582SpecialPositionsInABinaryMatrix().numSpecial(nums);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL1588SumOfAllOddLengthSubarrays() {
        int[] nums = {1, 4, 2, 5, 3};
        int res = new L1588SumOfAllOddLengthSubarrays().sumOddLengthSubarrays(nums);
        Assert.assertEquals(res, 58);
    }

    @Test
    public void testL1598CrawlerLogFolder() {
        String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        int res = new L1598CrawlerLogFolder().minOperations(logs);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1608SpecialArrayWithXElements() {
        int[] nums = {3, 5};
        int res = new L1608SpecialArrayWithXElements().specialArray(nums);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL1619MeanOfArrayAfterRemovingSomeElements() {
        int[] nums = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        double res = new L1619MeanOfArrayAfterRemovingSomeElements().trimMean(nums);
        Assert.assertEquals(res, 2, 0.00001);
    }

    @Test
    public void testL1629SlowestKey() {
        int[] nums = {9, 29, 49, 50};
        String keys = "cbcd";
        char res = new L1629SlowestKey().slowestKey(nums, keys);
        Assert.assertEquals(res, 'c');
    }

    @Test
    public void testL1636SortArrayByIncreasingFrequency() {
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] res = new L1636SortArrayByIncreasingFrequency().frequencySort(nums);
        int[] expected = {3, 1, 1, 2, 2, 2};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1640CheckArrayFormationThroughConcatenation() {
        int[] nums = {85};
        int[][] places = {{85}};
        boolean res = new L1640CheckArrayFormationThroughConcatenation().canFormArray(nums, places);
        Assert.assertTrue(res);
    }

    @Test
    public void testL1646GetMaximumInGeneratedArray() {
        int res = new L1646GetMaximumInGeneratedArray().getMaximumGenerated(7);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void testL1652DefuseTheBomb() {
        int[] nums = {5, 7, 1, 4};
        int[] res = new L1652DefuseTheBomb().decrypt(nums, 3);
        int[] expected = {12, 10, 16, 13};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1662CheckIfTwoStringArraysAreEquivalent() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        boolean res =
                new L1662CheckIfTwoStringArraysAreEquivalent().arrayStringsAreEqual(word1, word2);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1672RichestCustomerWealth() {
        int[][] nums = {{1, 2, 3}, {3, 2, 1}};
        int res = new L1672RichestCustomerWealth().richestCustomer(nums);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testL1684CountTheNumberOfConsistentStrings() {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int res =
                new L1684CountTheNumberOfConsistentStrings().countConsistentStrings(allowed, words);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1700NumberOfStudentsUnableToEatLunch() {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        int res = new L1700NumberOfStudentsUnableToEatLunch().countStudents(students, sandwiches);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void testL1710MaximumUnitsOnATruck() {
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        int res = new L1710MaximumUnitsOnATruck().maximumUnits(boxTypes, truckSize);
        int expected = 91;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1725NumberOfRectanglesThatCanFormTheLargestSquare() {
        int[][] rectangles = {{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        int res =
                new L1725NumberOfRectanglesThatCanFormTheLargestSquare()
                        .countGoodRectangles(rectangles);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1732FindTheHighestAltitude() {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        int res = new L1732FindTheHighestAltitude().largestAltitude(gain);
        Assert.assertEquals(res, 0);
    }

    @Test
    public void testL1742MaximumNumberOfBallsInABox() {
        int lowLimit = 5;
        int highLimit = 15;
        int res = new L1742MaximumNumberOfBallsInABox().countBalls(lowLimit, highLimit);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL1748SumOfUniqueElements() {
        int[] nums = {1, 1, 1, 1, 1};
        int res = new L1748SumOfUniqueElements().sumOfUnique(nums);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1752CheckIfArrayIsSortedAndRotated() {
        int[] nums = {1, 2, 3};
        boolean res = new L1752CheckIfArrayIsSortedAndRotated().check(nums);
        Assert.assertTrue(res);
    }

    @Test
    public void testL1758MinimumChangesToMakeAlternatingBinaryString() {
        String s = "1111";
        int res = new L1758MinimumChangesToMakeAlternatingBinaryString().minOperations(s);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL1773CountItemsMatchingARule() {
        List<String> list1 = Arrays.asList("phone", "blue", "pixel");
        List<String> list2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> list3 = Arrays.asList("phone", "gold", "iphone");
        List<List<String>> list = Arrays.asList(list1, list2, list3);
        String ruleKey = "color";
        String ruleValue = "silver";
        int res = new L1773CountItemsMatchingARule().countMatches(list, ruleKey, ruleValue);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL1779FindNearestPointThatHasTheSameXOrYCoordinate() {
        int x = 3;
        int y = 4;
        int[][] points = {{3, 4}};
        int res =
                new L1779FindNearestPointThatHasTheSameXOrYCoordinate()
                        .nearestValidPoint(x, y, points);
        Assert.assertEquals(res, 0);
    }

    @Test
    public void testL1800MaximumAscendingSubarraySum() {
        int[] nums = {10, 20, 30, 5, 10, 50};
        int res = new L1800MaximumAscendingSubarraySum().maxAscendingSum(nums);
        int expected = 65;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1816TruncateSentence() {
        String s = "What is the solution to this problem";
        int k = 4;
        String res = new L1816TruncateSentence().truncateSentence(s, k);
        String expected = "What is the solution";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1822SignOfTheProductOfAnArray() {
        int[] nums = {1, 5, 0, 2, -3};
        int res = new L1822SignOfTheProductOfAnArray().arraySign(nums);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1827MinimumOperationsToMakeTheArrayIncreasing() {
        int[] nums = {1, 5, 2, 4, 1};
        int res = new L1827MinimumOperationsToMakeTheArrayIncreasing().minOperations(nums);
        Assert.assertEquals(res, 14);
    }

    @Test
    public void testL1848MinimumDistanceToTheTargetElement() {
        int[] nums = {1};
        int target = 1;
        int start = 0;
        int res = new L1848MinimumDistanceToTheTargetElement().getMinDistance(nums, target, start);
        Assert.assertEquals(res, 0);
    }

    @Test
    public void testL1854MaximumPopulationYear() {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int res = new L1854MaximumPopulationYear().maximumPopulation(logs);
        Assert.assertEquals(res, 1960);
    }

    @Test
    public void testL1869LongerContiguousSegmentsOfOnesThanZeros() {
        String s = "111000";
        boolean res = new L1869LongerContiguousSegmentsOfOnesThanZeros().checkZeroOnes(s);
        Assert.assertFalse(res);
    }

    @Test
    public void testL1886DetermineWhetherMatrixCanBeObtainedByRotation() {
        int[][] mat = {{0, 1}, {1, 1}};
        int[][] target = {{1, 0}, {0, 1}};
        boolean res =
                new L1886DetermineWhetherMatrixCanBeObtainedByRotation().findRotation(mat, target);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1893CheckIfAllTheIntegersInARangeAreCovered() {
        int[][] ranges = {{1, 10}, {10, 20}};
        int left = 21;
        int right = 21;
        boolean res =
                new L1893CheckIfAllTheIntegersInARangeAreCovered().isCovered(ranges, left, right);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1909RemoveOneElementToMakeTheArrayStrictlyIncreasing() {
        int[] nums = {2, 3, 1, 2};
        boolean res =
                new L1909RemoveOneElementToMakeTheArrayStrictlyIncreasing().canBeIncreasing(nums);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1913MaximumProductDifferenceBetweenTwoPairs() {
        int[] nums = {4, 2, 5, 9, 7, 4, 8};
        int res = new L1913MaximumProductDifferenceBetweenTwoPairs().maxProductDifference(nums);
        int expected = 64;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1920BuildArrayFromPermutation() {
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] res = new L1920BuildArrayFromPermutation().buildArray(nums);
        int[] expected = {4, 5, 0, 1, 2, 3};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1929ConcatenationOfArray() {
        int[] nums = {1, 3, 2, 1};
        int[] res = new L1929ConcatenationOfArray().getConcatenation(nums);
        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1961CheckIfStringIsAPrefixOfArray() {
        String s = "iloveleetcode";
        String[] words = {"apples", "i", "love", "leetcode"};
        boolean res = new L1961CheckIfStringIsAPrefixOfArray().isPrefixString(s, words);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1984MinimumDifferenceBetweenHighestAndLowestOfKScores() {
        int[] nums = {90};
        int k = 1;
        int res =
                new L1984MinimumDifferenceBetweenHighestAndLowestOfKScores()
                        .minimumDifference(nums, k);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1991FindTheMiddleIndexInArray() {
        int[] nums = {1, -1, 4};
        int res = new L1991FindTheMiddleIndexInArray().findMiddleIndex(nums);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1995CountSpecialQuadruplets() {
        int[] nums = {3, 3, 6, 4, 5};
        int res = new L1995CountSpecialQuadruplets().countQuadruplets(nums);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2006CountNumberOfPairsWithAbsoluteDifferenceK() {
        int[] nums = {1, 3};
        int k = 3;
        int res = new L2006CountNumberOfPairsWithAbsoluteDifferenceK().countKDifference(nums, k);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2016MaximumDifferenceBetweenIncreasingElements() {
        int[] nums = {9, 4, 3, 2};
        int res = new L2016MaximumDifferenceBetweenIncreasingElements().maximumDifference(nums);
        int expected = -1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2022Convert1DArrayInto2DArray() {
        int[] original = {1, 2, 3};
        int m = 1;
        int n = 3;
        int[][] res = new L2022Convert1DArrayInto2DArray().construct2DArray(original, m, n);
        int[][] expected = {{1, 2, 3}};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2032TwoOutOfThree() {
        int[] nums1 = {3, 1};
        int[] nums2 = {2, 3};
        int[] nums3 = {1, 2};
        List<Integer> res = new L2032TwoOutOfThree().twoOutOfThree(nums1, nums2, nums3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        Collections.sort(res);
        Collections.sort(expected);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2037MinimumNumberOfMovesToSeatEveryone() {
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};
        int res = new L2037MinimumNumberOfMovesToSeatEveryone().minMovesToSeat(seats, students);
        int expected = 7;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2053KthDistinctStringInAnArray() {
        String[] arr = {"aaa", "aa", "a"};
        int k = 1;
        String res = new L2053KthDistinctStringInAnArray().kthDistinct(arr, k);
        String expected = "aaa";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2057SmallestIndexWithEqualValue() {
        int[] nums = {4, 3, 2, 1};
        int res = new L2057SmallestIndexWithEqualValue().smallestEqual(nums);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2073TimeNeededToBuyTickets() {
        int[] tickets = {5, 1, 1, 1};
        int k = 0;
        int res = new L2073TimeNeededToBuyTickets().timeRequiredToBuy(tickets, k);
        int expected = 8;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2078TwoFurthestHousesWithDifferentColors() {
        int[] colors = {1, 8, 3, 8, 3};
        int res = new L2078TwoFurthestHousesWithDifferentColors().maxDistance(colors);
        int expected = 4;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2085CountCommonWordsWithOneOccurrence() {
        String[] words1 = {"b", "bb", "bbb"};
        String[] words2 = {"a", "aa", "aaa"};
        int res = new L2085CountCommonWordsWithOneOccurrence().countWords(words1, words2);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2089FindTargetIndicesAfterSortingArray() {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 3;
        List<Integer> res =
                new L2089FindTargetIndicesAfterSortingArray().targetIndices(nums, target);
        List<Integer> expected = Collections.singletonList(3);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2099FindSubsequenceOfLengthKWithTheLargestSum() {
        int[] nums = {-1, -2, 3, 4};
        int k = 3;
        int[] res = new L2099FindSubsequenceOfLengthKWithTheLargestSum().maxSubsequence(nums, k);
        int[] expected = new int[] {-1, 3, 4};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2108FindFirstPalindromicStringInTheArray() {
        String[] words = {"notapalindrome", "racecar"};
        String res = new L2108FindFirstPalindromicStringInTheArray().firstPalindrome(words);
        String expected = "racecar";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2114MaximumNumberOfWordsFoundInSentences() {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int res = new L2114MaximumNumberOfWordsFoundInSentences().mostWordsFound(sentences);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2133CheckIfEveryRowAndColumnContainsAllNumbers() {
        int[][] matrix = {{1, 1, 1}, {1, 2, 3}, {1, 2, 3}};
        boolean res = new L2133CheckIfEveryRowAndColumnContainsAllNumbers().checkValid(matrix);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2144MinimumCostOfBuyingCandiesWithDiscount() {
        int[] cost = {6, 5, 7, 9, 2, 2};
        int res = new L2144MinimumCostOfBuyingCandiesWithDiscount().minimumCost(cost);
        int expected = 23;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2148CountElementsWithStrictlySmallerAndGreaterElements() {
        int[] nums = {-3, 3, 3, 90};
        int res = new L2148CountElementsWithStrictlySmallerAndGreaterElements().countElements(nums);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2154KeepMultiplyingFoundValuesByTwo() {
        int[] nums = {2, 7, 9};
        int original = 4;
        int res = new L2154KeepMultiplyingFoundValuesByTwo().findFinalValue(nums, original);
        int expected = 4;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2164SortEvenAndOddIndicesIndependently() {
        int[] nums = {2, 1};
        int[] res = new L2164SortEvenAndOddIndicesIndependently().sortEvenOdd(nums);
        int[] expected = {2, 1};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2176CountEqualAndDivisiblePairsInAnArray() {
        int[] nums = {1, 2, 3, 4};
        int k = 1;
        int res = new L2176CountEqualAndDivisiblePairsInAnArray().countPairs(nums, k);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2185CountingWordsWithAGivenPrefix() {
        String[] words = {"leetcode", "win", "loops", "success"};
        String pref = "code";
        int res = new L2185CountingWordsWithAGivenPrefix().prefixCount(words, pref);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2190MostFrequentNumberFollowingKeyInAnArray() {
        int[] nums = {2, 2, 2, 2, 3};
        int key = 2;
        int res = new L2190MostFrequentNumberFollowingKeyInAnArray().mostFrequent(nums, key);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2200FindAllKDistantIndicesInAnArray() {
        int[] nums = {2, 2, 2, 2, 2};
        int key = 2;
        int k = 2;
        List<Integer> res =
                new L2200FindAllKDistantIndicesInAnArray().findKDistantIndices(nums, key, k);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2206DivideArrayIntoEqualPairs() {
        int[] nums = {1, 2, 3, 4};
        boolean res = new L2206DivideArrayIntoEqualPairs().divideArray(nums);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2210CountHillsAndValleysInAnArray() {
        int[] nums = {6, 6, 5, 5, 4, 1};
        int res = new L2210CountHillsAndValleysInAnArray().countHillValley(nums);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testsL2215FindTheDifferenceOfTwoArrays() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> res =
                new L2215FindTheDifferenceOfTwoArrays().findDifference(nums1, nums2);
        List<List<Integer>> expected =
                Arrays.asList(Collections.singletonList(3), Collections.emptyList());
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2239FindClosestNumberToZero() {
        int[] nums = {2, -1, 1};
        int res = new L2239FindClosestNumberToZero().findClosestNumber(nums);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2248IntersectionOfMultipleArrays() {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> res = new L2248IntersectionOfMultipleArrays().intersection(nums);
        List<Integer> expected = Collections.emptyList();
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2255CountPrefixesOfAGivenString() {
        String[] words = {"a", "a"};
        String s = "aa";
        int res = new L2255CountPrefixesOfAGivenString().countPrefixes(words, s);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2293MinMaxGame() {
        int[] nums = {3};
        int res = new L2293MinMaxGame().minMaxGame(nums);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testtL2303CalculateAmountPaidInTaxes() {
        int[][] brackets = {{1, 0}, {4, 25}, {5, 50}};
        int income = 2;
        double res = new L2303CalculateAmountPaidInTaxes().calculateTax(brackets, income);
        double expected = 0.25;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2319CheckIfMatrixIsXMatrix() {
        int[][] grid = {{5, 7, 0}, {0, 3, 1}, {0, 5, 0}};
        boolean res = new L2319CheckIfMatrixIsXMatrix().checkXMatrix(grid);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2335MinimumAmountOfTimeToFillCups() {
        int[] amount = {5, 4, 4};
        int res = new L2335MinimumAmountOfTimeToFillCups().fillCups(amount);
        int expected = 7;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2341MaximumNumberOfPairsInArray() {
        int[] nums = {1, 1};
        int[] res = new L2341MaximumNumberOfPairsInArray().numberOfPairs(nums);
        int[] expected = {1, 0};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2347BestPokerHand() {
        int[] ranks = {4, 4, 2, 4, 4};
        char[] suits = {'d', 'a', 'a', 'b', 'b'};
        String res = new L2347BestPokerHand().bestHand(ranks, suits);
        String expected = "Three of a Kind";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2357MakeArrayZeroBySubtractingEqualAmounts() {
        int[] nums = {0};
        int res = new L2357MakeArrayZeroBySubtractingEqualAmounts().minimumOperations(nums);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2363MergeSimilarItems() {
        int[][] items1 = {{1, 1}, {3, 2}, {2, 3}};
        int[][] items2 = {{2, 1}, {3, 2}, {1, 3}};
        List<List<Integer>> res = new L2363MergeSimilarItems().mergeSimilarItems(items1, items2);
        List<List<Integer>> expected =
                Arrays.asList(Arrays.asList(1, 4), Arrays.asList(2, 4), Arrays.asList(3, 4));
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2367NumberOfArithmeticTriplets() {
        int[] nums = {4, 5, 6, 7, 8, 9};
        int diff = 2;
        int res = new L2367NumberOfArithmeticTriplets().arithmeticTriplets(nums, diff);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2383MinimumHoursOfTrainingToWinACompetition() {
        int initialEnergy = 2;
        int initialExperience = 4;
        int[] energy = {1};
        int[] experience = {3};
        int res =
                new L2383MinimumHoursOfTrainingToWinACompetition()
                        .minNumberOfHours(initialEnergy, initialExperience, energy, experience);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2389LongestSubsequenceWithLimitedSum() {
        int[] nums = {2, 3, 4, 5};
        int[] queries = {1};
        int[] res = new L2389LongestSubsequenceWithLimitedSum().answerQueries(nums, queries);
        int[] expected = new int[] {0};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2395FindSubarraysWithEqualSum() {
        int[] nums = {1, 2, 3, 4, 5};
        boolean res = new L2395FindSubarraysWithEqualSum().findSubarrays(nums);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2399CheckDistancesBetweenSameLetters() {
        String s = "aa";
        int[] distance = {
            1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };
        boolean res = new L2399CheckDistancesBetweenSameLetters().checkDistances(s, distance);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2404MostFrequentEvenElement() {
        int[] nums = {4, 4, 4, 9, 2, 4};
        int res = new L2404MostFrequentEvenElement().mostFrequentEven(nums);
        int expected = 4;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2418SortThePeople() {
        String[] names = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};
        String[] res = new L2418SortThePeople().sortPeople(names, heights);
        String[] expected = new String[] {"Bob", "Alice", "Bob"};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2432TheEmployeeThatWorkedOnTheLongestTask() {
        int n = 26;
        int[][] logs = {{1, 1}, {3, 7}, {2, 12}, {7, 17}};
        int res = new L2432TheEmployeeThatWorkedOnTheLongestTask().hardestWorker(n, logs);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2441LargestPositiveIntegerThatExistsWithItsNegative() {
        int[] nums = {-1, 2, -3, 3};
        int res = new L2441LargestPositiveIntegerThatExistsWithItsNegative().findMaxK(nums);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2446DetermineIfTwoEventsHaveConflict() {
        String[] event1 = {"01:15", "02:00"};
        String[] event2 = {"02:00", "03:00"};
        boolean res = new L2446DetermineIfTwoEventsHaveConflict().haveConflict(event1, event2);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2455AverageValueOfEvenNumbersThatAreDivisibleByThree() {
        int[] nums = {1, 3, 6, 10, 12, 15};
        int res = new L2455AverageValueOfEvenNumbersThatAreDivisibleByThree().averageValue(nums);
        int expected = 9;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2460ApplyOperationsToAnArray() {
        int[] nums = {1, 2, 2, 1, 1, 0};
        int[] res = new L2460ApplyOperationsToAnArray().applyOperations(nums);
        int[] expected = {1, 4, 2, 0, 0, 0};
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2465NumberOfDistinctAverages() {
        int[] nums = {4, 1, 4, 0, 3, 5};
        int res = new L2465NumberOfDistinctAverages().distinctAverages(nums);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2496MaximumValueOfAStringInAnArray() {
        String[] strs = {"alic3", "bob", "3", "4", "00000"};
        int res = new L2496MaximumValueOfAStringInAnArray().maximumValue(strs);
        int expected = 5;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2500DeleteGreatestValueInEachRow() {
        int[][] grid = {{1, 2, 4}, {3, 3, 1}};
        int res = new L2500DeleteGreatestValueInEachRow().deleteGreatestValue(grid);
        int expected = 8;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2511MaximumEnemyFortsThatCanBeCaptured() {
        int[] forts = {1, 0, 0, -1, 0, 0, 0, 0, 1};
        int res = new L2511MaximumEnemyFortsThatCanBeCaptured().captureForts(forts);
        int expected = 4;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2515ShortestDistanceToTargetStringInACircularArray() {
        String[] words = {"hello", "i", "am", "leetcode", "hello"};
        String target = "hello";
        int startIndex = 1;
        int res =
                new L2515ShortestDistanceToTargetStringInACircularArray()
                        .closetTarget(words, target, startIndex);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2529MaximumCountOfPositiveIntegerAndNegativeInteger() {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        int res = new L2529MaximumCountOfPositiveIntegerAndNegativeInteger().maximumCount(nums);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }
}
