/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    ////规律一眼就能看出来了，像右轮转k位，其实就是将数组末的k个数移到数组前面来
    k = k % nums.length;
    let temp = nums.splice(-k);
    nums.unshift(...temp);
    return nums;


};
let nums = [1,2,3,4,5,6,7];
let k = 3;
console.log(rotate(nums, k));
// /执行用时分布
// 0
// ms
// 击败
// 100.00%
// 复杂度分析
// 消耗内存分布
// 65.85
// MB
// 击败
// 9.73%