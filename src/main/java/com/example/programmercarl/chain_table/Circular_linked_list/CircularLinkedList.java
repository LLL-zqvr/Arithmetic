package com.example.programmercarl.chain_table.Circular_linked_list;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CircularLinkedList {
    /*
        leeCode 142. 环形链表 II
        给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。

        如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。

        不允许修改 链表。
     */
    /*
    先写一下自我感觉的难点吧，感觉难点就是因为不知道有没有存在环，无法进行循环来遍历（不知道停止条件），不知道链表的长度啊。
    1. 之前想过用flag[]来标记一下（因为不能改变原链表，如果节点属性有flag就好了但是并没有，节点也是给定的）。但是标记显然不行，
    因为flag难和链表绑定，如果用下标的话倒是可以，数组下标和链表编号匹配，但是连链表长度都不知道，哪里来的链表编号呢？
    2. 然后又想到如果设置q,p前后指针可不可以呢？p在前面走遍历，q在后面追，此时是p在q前面，但是如果有环的话
    p遍历到最后终会指向q。按照这个思路两层while循环。但是还是那个问题，终止条件是啥不知道啊。内层倒是简单了如果p->q|| p->null,
    就能停。但是外层呢？不知道长度又不能保证没环，设置不了终止条件啊。
    3. 前两个方法都是按照经验所谈，比较易想。如果该题是比较巧思的呢？能不能从之前写过的题提取灵感？比如把链表分成
    两个链（用两个指针来模拟头节点）前一个链表遍历后指向后一个链的末节点......等等等等，思路和2一样了。
    4. 此外还有的就是一些零碎的思路了...... 比如能不能通过计数来限制条件，像上一题的较优题解这样，很巧妙地通过两个链表
    长度之差向后对齐了链表再一个个比较。但是可惜没有找到该题的计数关系(T-T)
    5. 诶我去，谁说找不到？！我去，写完第四点之后盯着自己画的图看了一会儿，突然福至心灵。好像能写。q在前面跑，p在后面，计算
    p和q的最大距离。按道理来说应该是一直增大的，缩小就说明有环了。

     */
    public static ListNode detectCycle(ListNode head) {

        ListNode p = head;
        if(p == null){
            return null;
        }
        ListNode q = head.next;
        //人傻辽，为什么打出来的值会受到其他输入的影响啊
        //啊原来是java的链表储存的问题。
//        System.out.println(p);
//        System.out.println(q);
        //只有头节点且有环
        if(q == p){

            return p;
        }
        //只有头节点且没有环
        if(q == null){
            return null;
        }
        int num = 0;
        int max = 0;
        //
        if(q.next == null){
            return null;
        }
        while (num <= max && q.next != null){
            num = 0;
            p = head;
//            System.out.println(q);
            while (p != q){
                num++;
                p = p.next;
                if(max < num){
                    max = num;
                }
            }
            q = q.next;
//            System.out.println(num + " " + max);
            if(max > num || q.next == null){
                break;
            }

//            当是末尾且末尾自己为环
        if(q.next == q){
                            return q;
                        }


        }
        if(num == 0){
            return p;
        }
        //没有环：
        if(num == max){
            return null;
        }
        int sum = 0;
        p = head;
        while (sum != num){
            p = p.next;
            sum++;
        }

        return p;

    }

    public static void main(String[] args) {
        //[-1,-7,7,-4,19,6,-9,-5,-2,-5]
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(-7);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(-4);
        ListNode node4 = new ListNode(19);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(-9);
        ListNode node7 = new ListNode(-5);
        ListNode node8 = new ListNode(-2);
        ListNode node9 = new ListNode(-5);
        head.next = node1;
        node1.next = head;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node9;
        ListNode node = detectCycle(head);
        System.out.println(node);
        System.out.println(node9);
//        System.out.println(node);
//        ListNode p = head;
//        while (p != null){
//            System.out.println(p);
//            p = p.next;
//        }
    }
}
//结果：
/*
执行用时分布
141
ms
击败
2.93%
复杂度分析
消耗内存分布
43.46
MB
击败
70.57%

 */