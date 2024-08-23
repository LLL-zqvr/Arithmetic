package com.example.programmercarl.chain_table.circular_linked_list;

public class OtherSolution {
    //快慢指针法
    /*
    分别定义 fast 和 slow 指针，从头结点出发，fast指针每次移动两个节点，<br>
   slow指针每次移动一个节点，如果 fast 和 slow指针在途中相遇 ，说明这个链表有环。<br>
   另：在后面，fast一直都在环上移动了,所以后面两指针相遇也肯定在环上。<br>
   根据数量关系计算(画图然后各种计算关系)，可以得出:<br>
   从头结点出发一个指针，从相遇节点 也出发一个指针，这两个指针每次只走一个节点， <br>
   那么当这两个指针相遇的时候就是 环形入口的节点。
     */
    /*
    ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {// 有环
                ListNode index1 = fast;
                ListNode index2 = head;
                // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
     */
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
43.61
MB
击败
37.97%
 */