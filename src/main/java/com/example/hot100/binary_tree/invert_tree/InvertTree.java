package com.example.hot100.binary_tree.invert_tree;

import java.util.Scanner;

public class InvertTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //226. 翻转二叉树
    //简单
    //相关标签
    //相关企业
    //给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
    //
    //
    //
    //示例 1：
    //
    //
    //
    //输入：root = [4,2,7,1,3,6,9]
    //输出：[4,7,2,9,6,3,1]
    //示例 2：
    //
    //
    //
    //输入：root = [2,1,3]
    //输出：[2,3,1]
    //示例 3：
    //
    //输入：root = []
    //输出：[]

    public static void main(String[] args) {
        System.out.println("请输入root");
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine();
        String[] strs = str.split(", ");
        TreeNode root = new TreeNode();
        for(int i = 0; i < strs.length; i++){

        }
    }
}
