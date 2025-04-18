//141. 环形链表
// 简单
// 相关标签
// 相关企业
// 给你一个链表的头节点 head ，判断链表中是否有环。
//
// 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
//
// 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
//
//  输入：head = [3,2,0,-4], pos = 1
// 输出：true
// 解释：链表中有一个环，其尾部连接到第二个节点。

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */

//暴力法。
var hasCycle = function(head) {
    //将访问过的链表放入array，如果访问过了就说明有环
    let arr = [];
    let p = head;
    if(p == null) {
        return false;
    }
    while(p.next != null) {
        if(arr.includes(p)) {
            return true;
        } else {
            arr.push(p);
            p = p.next;
        }
    }
    return false;
};
//时间复杂度是n2，因为includes的时间复杂度是n
//执行用时分布
// 115
// ms
// 击败
// 5.19%
// 复杂度分析
// 消耗内存分布
// 59.68
// MB
// 击败
// 14.88%