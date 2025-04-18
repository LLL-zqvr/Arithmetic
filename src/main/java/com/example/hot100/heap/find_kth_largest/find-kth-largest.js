//215. 数组中的第K个最大元素
// 中等
// 相关标签
// 相关企业
// 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
//
// 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
//
// 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
//
//
//
// 示例 1:
//
// 输入: [3,2,1,5,6,4], k = 2
// 输出: 5
// 示例 2:
//
// 输入: [3,2,3,1,2,4,5,5,6], k = 4
// 输出: 4
//
//
// 提示：
//
// 1 <= k <= nums.length <= 105
// -104 <= nums[i] <= 104

let findKthLargest = function(nums, k) {
    //笑死,这也能过啊
    nums.sort((a, b) => b - a);
    return nums[k - 1];
};
//输入
let nums = [3,2,1,5,6,4];
let k = 2;
console.log(findKthLargest(nums, k))


//执行用时分布
// 114
// ms
// 击败
// 9.64%
// 复杂度分析
// 消耗内存分布
// 64.44
// MB
// 击败
// 48.56%