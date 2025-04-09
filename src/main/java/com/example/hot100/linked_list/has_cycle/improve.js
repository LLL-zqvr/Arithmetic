//快慢指针法
//想象兔子和乌龟在同一跑道上，一个速度快、另一个速度慢。如果跑道有环，
// 兔子必然在一段时间后追上乌龟。对于链表来说，如果在链表中引入两个以不同速度（一个比另一个快一倍）
// 前进的指针，在链表存在环的情况下，这两个指针必定会相遇。

let hasCycle = function (head) {
    //定义快慢指针,当快慢指针相遇则说明有环
    let fast = head;
    let slow = head;
    while (fast && fast.next) {
        fast = fast.next.next;
        slow = slow.next;
        if(fast === slow) {
            return true;
        }
    }
    return false;

};

//执行用时分布
// 55
// ms
// 击败
// 90.46%
// 复杂度分析
// 消耗内存分布
// 59.69
// MB
// 击败
// 14.42%