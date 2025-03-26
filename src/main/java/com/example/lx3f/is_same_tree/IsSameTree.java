package com.example.lx3f.is_same_tree;

public class IsSameTree {
    //100. 相同的树
    //已解答
    //简单
    //相关标签
    //相关企业
    //给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
    //
    //如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
    //
    //
    //
    //示例 1：
    //
    //
    //输入：p = [1,2,3], q = [1,2,3]
    //输出：true
    //示例 2：
    //
    //
    //输入：p = [1,2], q = [1,null,2]
    //输出：false
    //示例 3：
    //
    //
    //输入：p = [1,2,1], q = [1,1,2]
    //输出：false
    //
    //
    //提示：
    //
    //两棵树上的节点数目都在范围 [0, 100] 内
    //-104 <= Node.val <= 104

    //使用递归（分解问题版），1. 找出口 2. 递归调用
    //class Solution {
    //    public boolean isSameTree(TreeNode p, TreeNode q) {
    //        if (p == null || q == null) {
    //            return p == q; // 必须都是 null
    //        }
    //        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
//40.28
//MB
//击败
//52.32%