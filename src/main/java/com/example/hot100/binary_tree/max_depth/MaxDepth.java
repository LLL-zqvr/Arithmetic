package com.example.hot100.binary_tree.max_depth;

public class MaxDepth {
    //104. 二叉树的最大深度
    //已解答
    //简单
    //相关标签
    //相关企业
    //给定一个二叉树 root ，返回其最大深度。
    //
    //二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
    //
    //
    //
    //示例 1：
    //
    //
    //
    //
    //
    //输入：root = [3,9,20,null,null,15,7]
    //输出：3
    //示例 2：
    //
    //输入：root = [1,null,2]
    //输出：2
    //
    //
    //提示：
    //
    //树中节点的数量在 [0, 104] 区间内。
    //-100 <= Node.val <= 100

    ///**
    // * Definition for a binary tree node.
    // * public class TreeNode {
    // *     int val;
    // *     TreeNode left;
    // *     TreeNode right;
    // *     TreeNode() {}
    // *     TreeNode(int val) { this.val = val; }
    // *     TreeNode(int val, TreeNode left, TreeNode right) {
    // *         this.val = val;
    // *         this.left = left;
    // *         this.right = right;
    // *     }
    // * }
    // */
    //class Solution {
    //
    //    public int maxDepth(TreeNode root) {
    //        if (root == null) {
    //            return 0;
    //        }
    //        int lDepth = maxDepth(root.left);
    //        int rDepth = maxDepth(root.right);
    //        return Math.max(lDepth, rDepth) + 1;
    //
    //    }
    //}
}
//执行用时分布
//0
//ms
//击败
//100.00%
//复杂度分析
//消耗内存分布
//41.79
//MB
//击败
//57.51%