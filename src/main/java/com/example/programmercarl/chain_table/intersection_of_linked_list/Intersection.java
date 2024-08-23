package com.example.programmercarl.chain_table.intersection_of_linked_list;

import java.util.Scanner;

public class Intersection {
    /*

        面试题 02.07. 链表相交
        给你两个单链表的头节点 headA 和 headB ，
        请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
     */
    /*
    思路：先判断并排除头都是null等特殊情况，然后看最后一个节点一不一样，然后再从后往前比较。
     */
    public  static ListNode getNodeByIndex(ListNode head, int index){
        ListNode p = head;
        if(index < 0){
            return p;
        }
        int num = 0;
        while (num - 1 != index){
            p = p.next;
            num++;
        }
        return p;
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode p = headA;
            ListNode q = headB;
            int num1 = 0;
            if(p == null || q == null){
                return null;
            }
            if(p == q){
                return p;
            }
            while (p.next != null){
                num1++;
                p = p.next;
            }
            int num2 = 0;
            while (q.next != null){
                num2++;
                q = q.next;
            }
            if(p != q){
//                System.out.println("1");
                return null;
            }
            int sum = 1;
            ListNode node = null;
            while (p == q){
                p = getNodeByIndex(headA, num1 - sum);
                q = getNodeByIndex(headB, num2 - sum);
                if(p == q){
                    node = p;
                }
                sum++;
                if(num1 - sum < 0 && num2 - sum < 0){
                    break;
                }
            }
            if(p == headA){

            }

            return node;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(2);
        ListNode headB = new ListNode(3);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(12);
        headA.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        headB.next = node2;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入链表A：");
//        String a = sc.nextLine();
//        System.out.println("请输入链表B：");
//        String b = sc.nextLine();
//        String[] arr1 = a.split(",");
//        String[] arr2 = b.split(",");
//        int[] num1 = new int[arr1.length];
//        int[] num2 = new int[arr2.length];
//        ListNode p;
//        ListNode q;
//        headA = new ListNode(Integer.parseInt(arr1[0]));
//        headB = new ListNode(Integer.parseInt(arr2[0]));
//        p = headA;
//        q = headB;
//        for(int i = 1; i < arr1.length; i++){
//            num1[i] = Integer.parseInt(arr1[i]);
//            ListNode nodeA = new ListNode(num1[i]);
//            p.next = nodeA;
//            p = p.next;
//        }
//        p.next = null;
//        for(int i = 1; i < arr2.length; i++){
//            num2[i] = Integer.parseInt(arr2[i]);
//            ListNode nodeB = new ListNode(num2[i]);
//            q.next = nodeB;
//            q = q.next;
//        }
//        q.next = null;
//        p = headA;
//        q = headB;
//        while (p != null){
//            System.out.print(p.val + " ");
//            p = p.next;
//        }
//        System.out.println();
//        while (q != null){
//            System.out.print(q.val + " ");
//            q = q.next;
//        }
        ListNode node = getIntersectionNode(headA,headB);
        System.out.println(node);

    }
}
//结果：
/*
卡了两天.....终于做出来了。。差点就看答案了，本来一点头绪都莫得。。旅完游好像脑子清楚一点了....?
执行用时分布
1
ms
击败
99.97%
复杂度分析
消耗内存分布
47.37
MB
击败
75.08%

 */