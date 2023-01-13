package com.examples.leetcode.array_medium;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/permutations/ */
public class L46Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        generate(nums, res, new ArrayList<>(), visited);
        return res;
    }

    public void generate(
            int[] nums, List<List<Integer>> res, List<Integer> permutation, boolean[] visited) {
        if (permutation.size() == nums.length) {
            res.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (!visited[i]) {
                permutation.add(nums[i]);
                visited[i] = true;
                generate(nums, res, permutation, visited);
                permutation.remove(permutation.size() - 1);
                visited[i] = false;
            }
        }
    }
}
