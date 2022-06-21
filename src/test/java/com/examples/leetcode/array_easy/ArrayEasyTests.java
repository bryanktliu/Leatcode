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
        List<Integer> list = new L119PascalTriangle2().getRow(5);
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        int[] expected = {1, 4, 6, 4, 1};
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
        int[] nums = {0, 0};
        boolean res = new L605CanPlaceFlowers().canPlaceFlowers(nums, 2);
        Assert.assertTrue(res);
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
    public void testL697DegreeOfAnArray() {
        int[] nums = {1, 2, 2, 3, 1};
        int res = new L697DegreeOfAnArray().findShortestSubArray(nums);
        Assert.assertEquals(res, 2);
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
    public void testL1217MinimumCostToMoveChipsToTheSamePosition() {
        int[] nums = {1, 2, 3};
        int res = new L1217MinimumCostToMoveChipsToTheSamePosition().minCostToMoveChips(nums);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL1232CheckIfItIsAStraightLine() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean res = new L1232CheckIfItIsAStraightLine().checkStraightLine(coordinates);
        Assert.assertEquals(res, true);
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
    public void testL1672RichestCustomerWealth() {
        int[][] nums = {{1, 2, 3}, {3, 2, 1}};
        int res = new L1672RichestCustomerWealth().richestCustomer(nums);
        Assert.assertEquals(res, 6);
    }

    @Test
    public void testL1700NumberOfStudentsUnableToEatLunch() {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        int res = new L1700NumberOfStudentsUnableToEatLunch().countStudents(students, sandwiches);
        Assert.assertEquals(res, 3);
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
        int[] nums = {1, 2, 3, 2};
        int res = new L1748SumOfUniqueElements().sumOfUnique(nums);
        Assert.assertEquals(res, 0);
    }

    @Test
    public void testL1752CheckIfArrayIsSortedAndRotated() {
        int[] nums = {1, 2, 3};
        boolean res = new L1752CheckIfArrayIsSortedAndRotated().check(nums);
        Assert.assertEquals(res, true);
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
        Assert.assertEquals(res, false);
    }
}
