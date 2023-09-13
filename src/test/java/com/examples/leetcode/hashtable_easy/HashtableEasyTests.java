package com.examples.leetcode.hashtable_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HashtableEasyTests {

    @Test
    public void testL13RomanToInteger() {
        String s = "MCMXCIV";
        int res = new L13RomanToInteger().romanToInt(s);
        Assert.assertEquals(res, 1994);
    }

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
    public void testL383RansomNote() {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean res = new L383RansomNote().canConstruct(ransomNote, magazine);
        Assert.assertEquals(res, false);
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

    @Test
    public void testL409LongestPalindrome() {
        String s = "a";
        int res = new L409LongestPalindrome().longestPalindrome(s);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL463IslandPerimeter() {
        int[][] grid = {{1, 0}};
        int res = new L463IslandPerimeter().islandPerimeter(grid);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void testL500KeyboardRow() {
        String[] words = {"omk"};
        String[] res = new L500KeyboardRow().findWords(words);
        Assert.assertEquals(res, new String[] {});
    }

    @Test
    public void testL575DistributeCandies() {
        int[] candyType = {1, 1, 2, 3};
        int res = new L575DistributeCandies().distributeCandies(candyType);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL594LongestHarmoniousSubsequence() {
        int[] nums = {1, 2, 3, 4};
        int res = new L594LongestHarmoniousSubsequence().findLHS(nums);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL599MinimumIndexSumOfTwoLists() {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {
            "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"
        };
        String[] res = new L599MinimumIndexSumOfTwoLists().findRestaurant(list1, list2);
        Assert.assertEquals(res, new String[] {"Shogun"});
    }

    @Test
    public void testL645SetMismatch() {
        int[] nums = {1, 2, 2, 4};
        int[] res = new L645SetMismatch().findErrorNums(nums);
        Assert.assertEquals(res, new int[] {2, 3});
    }

    @Test
    public void testL690EmployeeImportance() {
        L690EmployeeImportance.Employee employee1 =
                new L690EmployeeImportance.Employee(1, 5, Arrays.asList(2, 3));
        L690EmployeeImportance.Employee employee2 =
                new L690EmployeeImportance.Employee(2, 3, Collections.emptyList());
        L690EmployeeImportance.Employee employee3 =
                new L690EmployeeImportance.Employee(3, 3, Collections.emptyList());
        List<L690EmployeeImportance.Employee> employees =
                Arrays.asList(employee1, employee2, employee3);
        int id = 1;
        int res = new L690EmployeeImportance().getImportance(employees, id);
        Assert.assertEquals(res, 11);
    }

    @Test
    public void testL720LongestWordInDictionary() {
        String[] words = {"w", "wo", "wor", "worl", "world"};
        String res = new L720LongestWordInDictionary().longestWord(words);
        Assert.assertEquals(res, "world");
    }

    @Test
    public void testL748ShortestCompletingWord() {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        String res = new L748ShortestCompletingWord().shortestCompletingWord(licensePlate, words);
        Assert.assertEquals(res, "steps");
    }

    @Test
    public void testL771JewelsAndStones() {
        String jewels = "z";
        String stones = "ZZ";
        int res = new L771JewelsAndStones().numJewelsInStones(jewels, stones);
        Assert.assertEquals(res, 0);
    }

    @Test
    public void tesL804UniqueMorseCodeWords() {
        String[] words = {"gin", "zen", "gig", "msg"};
        int res = new L804UniqueMorseCodeWords().uniqueMorseRepresentations(words);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL811SubdomainVisitCount() {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        List<String> res = new L811SubdomainVisitCount().subdomainVisits(cpdomains);
        Assert.assertEquals(
                res, Arrays.asList("9001 com", "9001 leetcode.com", "9001 discuss.leetcode.com"));
    }

    @Test
    public void testL819MostCommonWord() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String res = new L819MostCommonWord().mostCommonWord(paragraph, banned);
        Assert.assertEquals(res, "ball");
    }

    @Test
    public void testL859BuddyStrings() {
        String s = "aa";
        String goal = "aa";
        boolean res = new L859BuddyStrings().buddyStrings(s, goal);
        Assert.assertEquals(res, true);
    }

    @Test
    public void testL884UncommonWordsFromTwoSentences() {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] res = new L884UncommonWordsFromTwoSentences().uncommonFromSentences(s1, s2);
        Assert.assertEquals(res, new String[] {"sweet", "sour"});
    }

    @Test
    public void testL929UniqueEmailAddresses() {
        String[] emails = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };
        int res = new L929UniqueEmailAddresses().numUniqueEmails(emails);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL953VerifyingAnAlienDictionary() {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        boolean res = new L953VerifyingAnAlienDictionary().isAlienSorted(words, order);
        Assert.assertEquals(res, false);
    }

    @Test
    public void testL961NRepeatedElementInSize2NArray() {
        int[] nums = {5, 1, 5, 2, 5, 3, 5, 4};
        int res = new L961NRepeatedElementInSize2NArray().repeatedNTimes(nums);
        Assert.assertEquals(res, 5);
    }

    @Test
    public void testL997FindTheTownJudge() {
        int n = 2;
        int[][] trust = {{1, 2}};
        int res = new L997FindTheTownJudge().findJudge(n, trust);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL1189MaximumNumberOfBalloons() {
        String text = "nlaebolko";
        int res = new L1189MaximumNumberOfBalloons().maxNumberOfBalloons(text);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1370IncreasingDecreasingString() {
        String s = "rat";
        String res = new L1370IncreasingDecreasingString().sortString(s);
        String expected = "art";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1436DestinationCity() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        String res = new L1436DestinationCity().destCity(paths);
        String expected = "Sao Paulo";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1496PathCrossing() {
        String path = "NES";
        boolean res = new L1496PathCrossing().isPathCrossing(path);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1624LargestSubstringBetweenTwoEqualCharacters() {
        String s = "aa";
        int res =
                new L1624LargestSubstringBetweenTwoEqualCharacters()
                        .maxLengthBetweenEqualCharacters(s);
        int expected = 0;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1763LongestNiceSubstring() {
        String s = "YazaAay";
        String res = new L1763LongestNiceSubstring().longestNiceSubstring(s);
        String expected = "aAa";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1790CheckIfOneStringSwapCanMakeStringsEqual() {
        String s1 = "bank";
        String s2 = "kanb";
        boolean res = new L1790CheckIfOneStringSwapCanMakeStringsEqual().areAlmostEqual(s1, s2);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1796SecondLargestDigitInAString() {
        String s = "dfa12321afd";
        int res = new L1796SecondLargestDigitInAString().secondHighest(s);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1805NumberOfDifferentIntegersInAString() {
        String word = "a123bc34d8ef34";
        int res = new L1805NumberOfDifferentIntegersInAString().numDifferentIntegers(word);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1832CheckIfTheSentenceIsPangram() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean res = new L1832CheckIfTheSentenceIsPangram().checkIfPangram(sentence);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1876SubstringsOfSizeThreeWithDistinctCharacters() {
        String s = "xyzzaz";
        int res = new L1876SubstringsOfSizeThreeWithDistinctCharacters().countGoodSubstrings(s);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1897RedistributeCharactersToMakeAllStringsEqual() {
        String[] words = {"abc", "aabc", "bc"};
        boolean res = new L1897RedistributeCharactersToMakeAllStringsEqual().makeEqual(words);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1935MaximumNumberOfWordsYouCanType() {
        String text = "hello world";
        String brokenLetters = "ad";
        int res = new L1935MaximumNumberOfWordsYouCanType().canBeTypedWords(text, brokenLetters);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL1941CheckIfAllCharactersHaveEqualNumberOfOccurrences() {
        String s = "abacbc";
        boolean res =
                new L1941CheckIfAllCharactersHaveEqualNumberOfOccurrences().areOccurrencesEqual(s);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2062CountVowelSubstringsOfAString() {
        String word = "aeiouu";
        int res = new L2062CountVowelSubstringsOfAString().countVowelSubstrings2(word);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2068CheckWhetherTwoStringsAreAlmostEquivalent() {
        String word1 = "aaaa";
        String word2 = "bccb";
        boolean res =
                new L2068CheckWhetherTwoStringsAreAlmostEquivalent()
                        .checkAlmostEquivalent(word1, word2);
        boolean expected = false;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2103RingsAndRods() {
        String rings = "B0B6G0R6R0R6G9";
        int res = new L2103RingsAndRods().countPoints(rings);
        int expected = 1;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2283CheckIfNumberHasEqualDigitCountAndDigitValue() {
        String num = "1210";
        boolean res = new L2283CheckIfNumberHasEqualDigitCountAndDigitValue().digitCount(num);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2287RearrangeCharactersToMakeTargetString() {
        String s = "ilovecodingonleetcode";
        String target = "code";
        int res = new L2287RearrangeCharactersToMakeTargetString().rearrangeCharacters(s, target);
        int expected = 2;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2309GreatestEnglishLetterInUpperAndLowerCase() {
        String s = "lEeTcOdE";
        String res = new L2309GreatestEnglishLetterInUpperAndLowerCase().greatestLetter(s);
        String expected = "E";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2325DecodeTheMessage() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String res = new L2325DecodeTheMessage().decodeMessage(key, message);
        String expected = "this is a secret";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2351FirstLetterToAppearTwice() {
        String s = "abccbaacz";
        char res = new L2351FirstLetterToAppearTwice().repeatedCharacter(s);
        char expected = 'c';
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2423RemoveLetterToEqualizeFrequency() {
        String word = "abcc";
        boolean res = new L2423RemoveLetterToEqualizeFrequency().equalFrequency(word);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2451OddStringDifference() {
        String[] words = {"adc", "wzy", "abc"};
        String res = new L2451OddStringDifference().oddString(words);
        String expected = "abc";
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2716MinimizeStringLength() {
        String s = "aaabc";
        int res = new L2716MinimizeStringLength().minimizedStringLength(s);
        int expected = 3;
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL2729CheckIfTheNumberIsFascinating() {
        int n = 192;
        boolean res = new L2729CheckIfTheNumberIsFascinating().isFascinating(n);
        boolean expected = true;
        Assert.assertEquals(res, expected);
    }
}
