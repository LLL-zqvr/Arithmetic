package com.example.hot100.linked_list.is_palindrome;

import java.util.Scanner;

public class IsPalindrome {
//    234. 回文链表
//已解答
//简单
//相关标签
//相关企业
//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
//
//
//
//示例 1：
//
//
//输入：head = [1,2,2,1]
//输出：true
//示例 2：
//
//
//输入：head = [1,2]
//输出：false
//
//
//提示：
//
//链表中节点数目在范围[1, 105] 内
//0 <= Node.val <= 9
//
    //思路，找到中间那个节点的前一个节点，链从那里裂开来，中间节点作为第二个链表的头，然后把右边的节点反转，然后比较
    //和题解思路一样，嘿嘿嘿
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode start = null;
        ListNode p = new ListNode(), l, r;
        p.next = head;
        int len = 0;
        while(p.next != null) {
            len++;
            p = p.next;
        }
        len = len / 2 ;//得出中间那个节点的前一个索引
        p = new ListNode();
        ListNode pre = new ListNode();
        pre.next = head;
        for(int i = 0; i < len; i++) {
            pre = pre.next;
        }
//        System.out.println(pre.val);
        p = pre.next;//p是中间那个节点
        pre.next = null;
        //接下来就是把p之后的节点都反转
        l = p;
        r = p.next;
        p.next = null;
        while(r != null) {
            p = r;
            r = r.next;
            p.next = l;
            l = p;
        }
        //此时head是左边的头，p是右边的头，两边同时遍历比较就ok了
        while(head != null && p != null) {
            if(head.val == p.val) {
//                System.out.println(head.val + " == " + p.val);
//                System.out.println(head.next.val + " == " + p.next.val);
                head = head.next;
                p = p.next;
            } else {
//                System.out.println(head.val + " " + p.val);
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println("请输入链表:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(",");
        int[] nums = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        ListNode head = new ListNode(nums[0]);
        ListNode p = head;
        for(int i = 1; i < arr.length; i++) {
            p.next = new ListNode(nums[i]);
            p = p.next;

        }
        p.next = null;
        Boolean result = isPalindrome(head);
        System.out.println(result);
    }
}
//执行用时分布
//4
//ms
//击败
//87.05%
//复杂度分析
//消耗内存分布
//67.40
//MB
//击败
//17.49%