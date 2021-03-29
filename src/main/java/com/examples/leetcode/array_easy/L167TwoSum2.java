/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ */
public class L167TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] >= target) {
                return null;
            }
            int other = target - numbers[i];
            int index = Arrays.binarySearch(numbers, other);
            if (index > 0) {
                ret[0] = i + 1;
                if (index == i) {
                    ++index;
                }
                ret[1] = index + 1;
                break;
            }
        }
        return ret;
    }
}
