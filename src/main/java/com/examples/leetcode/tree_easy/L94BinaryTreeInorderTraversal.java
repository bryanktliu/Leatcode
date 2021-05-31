package com.examples.leetcode.tree_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/binary-tree-inorder-traversal/ */
public class L94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }
}
