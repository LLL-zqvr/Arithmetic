
//53. 最大子数组和
// 中等
// 相关标签
// 相关企业
// 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
// 子数组是数组中的一个连续部分。
//
//
//
// 示例 1：
//
// 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
// 输出：6
// 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 示例 2：
//
// 输入：nums = [1]
// 输出：1
// 示例 3：
//
// 输入：nums = [5,4,-1,7,8]
// 输出：23
//
//
// 提示：
//
// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
//
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
/**
 * @param {number[]} nums
 * @return {number}
 */
//思路：相加后的值如果大于0，则相加，如果小于0，则sum = nums[i]
var maxSubArray = function(nums) {
    let sum = 0;
     let max = nums[0];
    for(let i = 0; i < nums.length; i++) {
        if(sum >= 0) {
            sum += nums[i];

        } else {
            sum = nums[i];
        }
        // console.log(sum, nums[i])
        if(sum >= max) {
            max = sum;
        }
    }

    return max;

};
let nums =[-2,1,-3,4,-1,2,1,-5,4];
let result = maxSubArray(nums);
console.log(result)
//执行用时分布
// 1
// ms
// 击败
// 96.91%
// 复杂度分析
// 消耗内存分布
// 63.61
// MB
// 击败
// 73.51%