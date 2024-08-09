package com.example.programmercarl.chain_table.design_linked_list;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0,10);
        myLinkedList.addAtIndex(0,20);
        ListNode p = new ListNode();
        p = myLinkedList.head.next;
        while (p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
}
