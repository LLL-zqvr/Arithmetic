package com.example.programmercarl.chain_table.remove_linked_list_element;

import java.util.Scanner;

public class Improve {
    //203. 移除链表元素
    /*
    给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，
    并返回 新的头节点 。
     */
    /*
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) {
            head = head.next;
        }
        ListNode curr = head;
        while(curr!=null && curr.next !=null) {
            if(curr.next.val == val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode p = head;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入链表的值:");
        String str = sc.nextLine();
        String[] arr = str.split(",");
        int[] num = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        head.val = num[0];
        for(int i = 1; i < num.length; i++){
            p.next = new ListNode();
            p.next.val = num[i];
            p = p.next;
        }
        p.next = null;
//        p = head;
//        while (p!= null){
//            System.out.println(p.val);
//            p = p.next;
//        }
        System.out.println("请输入val的值：");
        int val = sc.nextInt();
        p = removeElements(head, val);
        while (p!= null){
            System.out.println(p.val);
            p = p.next;
        }

    }
}
//结果
/*

执行用时分布
1
ms
击败
59.69%
复杂度分析
消耗内存分布
44.32
MB
击败
82.59%

 */