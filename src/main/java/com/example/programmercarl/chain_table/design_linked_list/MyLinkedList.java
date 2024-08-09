package com.example.programmercarl.chain_table.design_linked_list;

public class MyLinkedList {
    //节点数
    int size = 0;
    //虚拟头节点
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    //下面自定义函数是辅助接下来的实现的
    public ListNode getNodeByIndex(int index){
        int num = 0;
        ListNode p = new ListNode();
        p = this.head.next;
        while(p.next != null){
            if(num == index){
                break;
            }
            p = p.next;
            num++;
        }
        return p;
    }
    public int get(int index) {
        if(index >= size){
            return -1;
        }
       return this.getNodeByIndex(index).val;
    }

    public void addAtHead(int val) {

        ListNode listNode = new ListNode(val);
        listNode.next = head.next;
        head.next = listNode;
        size++;

    }

    public void addAtTail(int val) {
        ListNode listNode = new ListNode(val);
        listNode.next = null;
        ListNode p = this.head;
        while(p.next != null){
            p = p.next;
        }
        p.next = listNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        /*
            void addAtIndex(int index, int val) 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。
            如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。
            如果 index 比长度更大，该节点将 不会插入 到链表中。
         */
        if(index < this.size){
            ListNode node = new ListNode(val);
            ListNode p;
            if(index != 0){
                 p = this.getNodeByIndex(index - 1);
            }else{
                p = this.head;
            }

            node.next = p.next;
            p.next = node;
            size++;
        }
        if(index == this.size){
            this.addAtTail(val);
        }

    }

    public void deleteAtIndex(int index) {
        if(index >= 0 && index <= size - 1){
            ListNode p;
            if(index != 0){
                p = this.getNodeByIndex(index - 1);//待删除节点的上一个节点
            }else {
                p = this.head;
            }
            p.next = p.next.next;
            this.size--;
        }
    }
}
//结果：
// 第一次
/*
执行用时分布
12
ms
击败
6.80%
复杂度分析
消耗内存分布
44.22
MB
击败
98.08%

第二次：改了一下delete部分，之前还计算记录了一下待删除的节点（调用函数）并且删时用了中间变量记录了node.next，没想到改了之后减了整整两秒
(事实上直接node.next = node.next.next就行)
执行用时分布
10
ms
击败
32.41%
复杂度分析
消耗内存分布
44.30
MB
击败
92.87%


 */
