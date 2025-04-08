//239. 滑动窗口最大值
// 困难
// 相关标签
// 相关企业
// 提示
// 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
//
// 返回 滑动窗口中的最大值 。
//
//
//
// 示例 1：
//
// 输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
// 输出：[3,3,5,5,6,7]
// 解释：
// 滑动窗口的位置                最大值
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7
// 示例 2：
//
// 输入：nums = [1], k = 1
// 输出：[1]
//
//
// 提示：
//
// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// 1 <= k <= nums.length

// let maxSlidingWindow = function(nums, k) {
//     let result = [];
//     let a = [];
//     for(let i = 0; i < nums.length; i++) {
//         if(a.length < k) {
//             a.push(nums[i]);
//             continue;
//         }
//         if(a.length === k) {
//             result.push(Math.max(...a));
//             a.push(nums[i]);
//         }
//         if(a.length > k) {
//             a.shift();
//         }
//     }
//     result.push(Math.max(...a));
//     return result;
// };
//
// let nums = [1,3,-1,-3,5,3,6,7];
// let k = 3;
// console.log(maxSlidingWindow(nums, k))


//超时了

//单调队列

let maxSlidingWindow = function(nums, k) {
    const ans = [];
    //单调队列，单调递减，记录下标
    const q = [];
    for (let i = 0; i < nums.length; i++) {
        // 1. 入
        //当队尾元素小于当前元素，则队尾元素出队，直到队尾元素大于当前元素，保证单调性
        while (q.length && nums[q[q.length - 1]] <= nums[i]) {
            q.pop(); // 维护 q 的单调性
        }
        q.push(i); // 入队
        // 2. 出
        if (i - q[0] >= k) { // 队首已经离开窗口了
            q.shift(); // 力扣没有 Deque，不过这样写也挺快的
        }
        // 3. 记录答案
        if (i >= k - 1) {
            // 由于队首到队尾单调递减，所以窗口最大值就是队首
            ans.push(nums[q[0]]);
        }
    }
    return ans;
};

let nums = [1,3,-1,-3,5,3,6,7];
let k = 3;
console.log(maxSlidingWindow(nums, k))

//执行用时分布
// 31
// ms
// 击败
// 78.49%
// 复杂度分析
// 消耗内存分布
// 88.07
// MB
// 击败
// 22.48%