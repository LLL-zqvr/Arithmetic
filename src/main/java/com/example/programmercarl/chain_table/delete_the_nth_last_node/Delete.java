package com.example.programmercarl.chain_table.delete_the_nth_last_node;

import java.util.Scanner;

public class Delete {
    //leeCode 19
    /*
        给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
        进阶：你能尝试使用一趟扫描实现吗？
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre, p;
        p = head;
        pre = head;
        int num = 0;
        //计算出链表中有多少个节点
        while(p != null){
            num++;
            p = p.next;
        }
        //当节点数为零，说明链表为空，直接返回即可
        if(num == 0){
            return head;
        }
        //当节点数等于n，说明要删除头节点
        if(num == n){
            head = head.next;
            return head;
        }
        p = head;
        //因为是倒序所以是num--
        while (p != null){
            if(num == n){
                break;
            }
            pre = p;
            num--;
            p = p.next;

        }
        pre.next = p.next;
        return head;
    }
    public static void main(String[] args){
        System.out.println("请输入链表:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(",");
        int[] num = new int[arr.length];
        num[0] = Integer.parseInt(arr[0]);
        ListNode head = new ListNode(num[0]);
        ListNode p = head;
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
        System.out.println("请输入n：");
        int n = sc.nextInt();
        head = removeNthFromEnd(head,n);
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
40.56
MB
击败
95.22%

 */