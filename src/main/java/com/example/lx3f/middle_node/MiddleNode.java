package com.example.lx3f.middle_node;

public class MiddleNode {
    //876. 链表的中间结点
    //已解答
    //简单
    //相关标签
    //相关企业
    //给你单链表的头结点 head ，请你找出并返回链表的中间结点。
    //
    //如果有两个中间结点，则返回第二个中间结点。
    //
    //
    //
    //示例 1：
    //
    //
    //输入：head = [1,2,3,4,5]
    //输出：[3,4,5]
    //解释：链表只有一个中间结点，值为 3 。
    //示例 2：
    //
    //
    //输入：head = [1,2,3,4,5,6]
    //输出：[4,5,6]
    //解释：该链表有两个中间结点，值分别为 3 和 4 ，返回第二个结点。
    //
    //
    //提示：
    //
    //链表的结点数范围是 [1, 100]
    //1 <= Node.val <= 100

//思路：最简单的，遍历链表，记录链表长度，然后根据链表长度，找到中间结点。
    ///**
    // * Definition for singly-linked list.
    // * public class ListNode {
    // *     int val;
    // *     ListNode next;
    // *     ListNode() {}
    // *     ListNode(int val) { this.val = val; }
    // *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    // * }
    // */
    //class Solution {
    //    public ListNode middleNode(ListNode head) {
    //        ListNode p = head;
    //        int len = 0;
    //        while(p != null) {
    //            len++;
    //            p = p.next;
    //        }
    //        // len = len % 2 == 0 ? len / 2 : len / 2 + 1;
    //        len = len / 2;
    //        p = head;
    //        for(int i = 0; i < len; i++) {
    //            p = p.next;
    //        }
    //        return p;
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
//40.16
//MB
//击败
//92.00%