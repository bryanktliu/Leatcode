package com.examples.leetcode.tree_easy;

import java.util.Iterator;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode deserialize(Iterator<Integer> it) {
        if (!it.hasNext()) {
            return null;
        }
        Integer val = it.next();
        if (val == null) {
            return null;
        }
        TreeNode node = new TreeNode(val);
        node.left = deserialize(it);
        node.right = deserialize(it);
        return node;
    }
}
