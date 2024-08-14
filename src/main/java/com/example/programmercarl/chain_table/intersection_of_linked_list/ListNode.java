package com.example.programmercarl.chain_table.intersection_of_linked_list;

public class ListNode {
    //节点的值
    int val;
    //下一个节点
    ListNode next;
    //节点的构造函数(无参)
    public ListNode(){

    }
    //节点的构造函数(一个参数)
    public ListNode(int val){
        this.val = val;
    }
    //节点的构造函数(两个参数)
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
