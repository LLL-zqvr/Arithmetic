package com.example.programmercarl.chain_table.reverse_linked_list;

import java.util.Scanner;

public class ImproveRecursion {
    public static ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private static ListNode reverse(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode temp = null;
        temp = cur.next;// 先保存下一个节点
        cur.next = prev;// 反转
        // 更新prev、cur位置
        // prev = cur;
        // cur = temp;
        return reverse(cur, temp);
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
