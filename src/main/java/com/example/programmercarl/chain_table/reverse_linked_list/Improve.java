package com.example.programmercarl.chain_table.reverse_linked_list;

import java.util.Scanner;

public class Improve {

    public static ListNode reverseList(ListNode head){
            ListNode l, r, temp;
            l = null;
            temp = head;
            r = null;
            while (temp.next != null){
                r = temp.next;
                temp.next = l;
                l = temp;
                temp = r;
            }
            return l;
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
41.33
MB
击败
77.84%

 */