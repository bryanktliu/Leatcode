package com.examples.leetcode.tree_easy;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TreeEasyTests {

    @Test
    public void L94BinaryTreeInorderTraversal() {
        TreeNode root = TreeNode.deserialize(Arrays.asList(1, null, 2, 3).iterator());
        List<Integer> res = new L94BinaryTreeInorderTraversal().inorderTraversal(root);
        Assert.assertEquals(res, Arrays.asList(1, 3, 2));
    }
}
