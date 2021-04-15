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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** https://leetcode.com/problems/summary-ranges/ */
public class L228SumaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<>();
        int start = 0;
        int len = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1] + 1) {
                if (len == 0) {
                    list.add(Integer.toString(nums[start]));
                } else {
                    list.add(nums[start] + "->" + nums[start + len]);
                }
                len = 0;
                start = i;
            } else {
                ++len;
            }
        }
        if (len == 0) {
            list.add(Integer.toString(nums[start]));
        } else {
            list.add(nums[start] + "->" + nums[start + len]);
        }
        return list;
    }
}
