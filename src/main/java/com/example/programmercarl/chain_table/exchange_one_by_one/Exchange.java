package com.example.programmercarl.chain_table.exchange_one_by_one;

import java.util.Scanner;

public class Exchange {
    //leeCode 24
    /*
        给你一个链表，
        两两交换其中相邻的节点，并返回交换后链表的头节点。
        你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
     */
    public static ListNode swapPairs(ListNode head) {
        ListNode p = head;
        int num = 0;
        while(p != null){
            num++;
            p = p.next;
        }
        if(head == null || num == 1){
            return head;
        }
        ListNode l, r, temp;
        l = head;
        r = head.next;
        temp = r;
        //先解决l==head的情况
        r = r.next;
        l.next = temp.next;
        temp.next = l;
        head = temp;
        //别忘了把前面的节点修改后的节点串起来！
        ListNode pre;
        while (r != null && r.next != null){
            pre = l;
            l = r;
            temp = r.next;
            r = r.next.next;
            l.next = temp.next;
            temp.next = l;
            pre.next = temp;

        }
        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode p = head;
        System.out.println("请输入链表值:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(",");
        int[] num = new int[arr.length];
        num[0] = Integer.parseInt(arr[0]);
        head.val = num[0];
        for(int i = 1; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
            ListNode node = new ListNode(num[i]);
            p.next = node;
            p = p.next;
        }
        p = head;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
        head = swapPairs(head);
        p = head;
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
40.23
MB
击败
64.22%

 */