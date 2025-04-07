//560. 和为 K 的子数组
// 尝试过
// 中等
// 相关标签
// 相关企业
// 提示
// 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
//
// 子数组是数组中元素的连续非空序列。
//
//
//
// 示例 1：
//
// 输入：nums = [1,1,1], k = 2
// 输出：2
// 示例 2：
//
// 输入：nums = [1,2,3], k = 3
// 输出：2
//
//
// 提示：
//
// 1 <= nums.length <= 2 * 104
// -1000 <= nums[i] <= 1000
// -107 <= k <= 107
///**
//  * @param {number[]} nums
//  * @param {number} k
//  * @return {number}
//  */
// var subarraySum = function(nums, k) {
//     //思路：滑动窗口法(X)不能用滑动窗口！滑动窗口必须是单调的数组
//     let left = 0;
//     let right = 0;
//     let result = 0;
//     let sum = 0;
//     // if(nums[left] == k) {
//     //     result++;
//     // }
//     for(let right = 0; right < nums.length; right++) {
//         sum += nums[right];
//         while(sum > k) {
//             sum -= nums[left];
//             left++;
//         }
//         if(sum == k) {
//             result++;
//         }
//     }
//     return result;
// };
//正确思路：前缀和
//s[j]−s[i]=k ——————》s[i] = s[j]−k
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
let subarraySum = function(nums, k) {
    const n = nums.length;
    const s = new Array(n + 1).fill(0);
    //计算前缀和
    for(let i = 0; i < n; i++) {
        s[i + 1] = s[i] + nums[i];
    }
    let result = 0;
    const map = new Map();
    // for(const sj of s) {
    //     result += map.get(sj - k) ?? 0;
    //     console.log(sj)
    //     //如果键存在就+1，不存在就初始化为1
    //     map.set(sj, (map.get(sj) ?? 0) + 1) ;
    // }
    for(let j = 0; j < s.length; j++) {
        result += map.get(s[j] - k) ?? 0;
        console.log(s[j] )
        console.log(map.get(s[j] - k))
        console.log("+++++++++++")
        map.set(s[j], (map.get(s[j]) ?? 0) + 1) ;
    }
    console.log(map)
    return result;
};
let nums = [1,2,3], k = 3;
console.log(subarraySum(nums, k))