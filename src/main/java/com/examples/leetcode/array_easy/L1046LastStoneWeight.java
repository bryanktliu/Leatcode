package com.examples.leetcode.array_easy;

import java.util.Collections;
import java.util.PriorityQueue;

/** https://leetcode.com/problems/last-stone-weight/ */
public class L1046LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            int big = queue.poll();
            int small = queue.poll();
            if (big != small) {
                queue.add(big - small);
            }
        }
        if (queue.size() == 0) {
            return 0;
        } else {
            return queue.poll();
        }
    }
}
