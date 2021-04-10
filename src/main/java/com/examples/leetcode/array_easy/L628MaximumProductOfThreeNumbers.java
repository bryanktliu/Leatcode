package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-product-of-three-numbers/ */
public class L628MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        int smallest = 1001;
        int smaller = 1001;
        int largest = -1001;
        int larger = -1001;
        int large = -1001;
        for (int num : nums) {
            if (num < smaller) {
                if (num < smallest) {
                    smaller = smallest;
                    smallest = num;
                } else {
                    smaller = num;
                }
            }
            if (num > large) {
                if (num > larger) {
                    if (num > largest) {
                        large = larger;
                        larger = largest;
                        largest = num;
                    } else {
                        large = larger;
                        larger = num;
                    }
                } else {
                    large = num;
                }
            }
        }
        return Math.max(large * larger * largest, smaller * smallest * largest);
    }
}
