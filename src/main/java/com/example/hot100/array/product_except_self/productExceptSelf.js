//238. 除自身以外数组的乘积
// 中等
// 相关标签
// 相关企业
// 提示
// 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
//
// 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
//
// 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
//
//
//
// 示例 1:
//
// 输入: nums = [1,2,3,4]
// 输出: [24,12,8,6]
// 示例 2:
//
// 输入: nums = [-1,1,0,-3,3]
// 输出: [0,0,9,0,0]
//
//
// 提示：
//
// 2 <= nums.length <= 105
// -30 <= nums[i] <= 30
// 输入 保证 数组 answer[i] 在  32 位 整数范围内
//
//
// 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组 不被视为 额外空间。）


/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    //根据题目的提示，感觉可以从前后缀入手。
    //思路：分别算出前后缀，从前往后算出前缀，从后往前算出后缀，然后前后缀相乘
    let bef = [];
    let aft = [];
    let news = [];
    bef[0] = 1;
    aft[nums.length - 1] = 1;
    for(let i = 1; i < nums.length; i++) {
        bef[i] = nums[i - 1] * bef[i - 1];
        aft[nums.length - i - 1] = nums[nums.length - i] * aft[nums.length - i];
    }
    console.log(bef)
    console.log(aft)
    for(let i = 0; i < nums.length; i++) {
        news.push(bef[i] * aft[i]);
    }
    return news;
};
let nums = [1,2,3,4];
let res = productExceptSelf(nums);
console.log(res);
// 执行用时分布
// 35
// ms
// 击败
// 11.19%
// 复杂度分析
// 消耗内存分布
// 72.39
// MB
// 击败
// 5.70%
//复杂度不咋地，但是居然和题解一模一样