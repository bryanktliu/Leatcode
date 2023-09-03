package com.examples.leetcode.array_medium;

import java.util.PriorityQueue;

/** https://leetcode.com/problems/top-k-frequent-elements/ */
public class L347TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int[] count = new int[max - min + 1];
        for (int num : nums) {
            num -= min;
            ++count[num];
        }
        PriorityQueue<Integer> topK = new PriorityQueue<>((a, b) -> count[b] - count[a]);
        for (int i = 0; i < count.length; ++i) {
            if (count[i] > 0) {
                topK.add(i);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = topK.poll() + min;
        }
        return res;
    }
}
