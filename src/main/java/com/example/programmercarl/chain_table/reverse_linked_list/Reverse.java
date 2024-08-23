package com.example.programmercarl.chain_table.reverse_linked_list;

import java.util.Scanner;

public class Reverse {
    public static ListNode reverseList(ListNode head){
        /*
        206. 反转链表
        给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
         */
        ListNode p = head;
        int num = 0;
        while (p != null){
            num++;
            p = p.next;
        }
        if(num >= 2){
            ListNode l, r, temp;
            l = head;
            temp = head.next;
            r = head.next.next;
            l.next = null;
            while (temp.next != null){
                temp.next = l;
                l = temp;
                temp = r;
                r = r.next;

            }
            temp.next = l;
            return temp;
        }else {
            return head;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode p = head;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入链表的元素");
        String str = sc.nextLine();
        String[] arr = str.split(",");
        int[] num = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
            ListNode node = new ListNode(num[i]);
            p.next = node;
            node.next = null;
            p = p.next;
        }
        p.next = null;
        p = head;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
//        来个左右指针法

        p = reverseList(head);
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }


    }
}
//结果：
/*
执行用时分布
0
ms
击败
100.00%
复杂度分析
消耗内存分布
41.48
MB
击败
28.91%
 */