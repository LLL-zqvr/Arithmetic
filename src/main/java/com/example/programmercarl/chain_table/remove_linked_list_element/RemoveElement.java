package com.example.programmercarl.chain_table.remove_linked_list_element;

import java.util.Scanner;

public class RemoveElement {
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
        ListNode p = head;
        int len = 0;
        while (p != null) {
            len++;
            p = p.next;
        }
        p = head;
        ListNode temp;
        //如果从头到尾都是需要删除的值
        for (int i = 0; i < len; i++) {
            if(head == null){
                return head;
            }
            if (p.val == val) {
                p = p.next;
                head = p;
            }else {
                break;
            }

        }
        //头部肯定不是被删除的值了
        while (p != null && p.next != null){
            if(p.next.val == val){
                temp = p.next;
                p.next = temp.next;
                p = p.next;
            }else {
                p = p.next;
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
