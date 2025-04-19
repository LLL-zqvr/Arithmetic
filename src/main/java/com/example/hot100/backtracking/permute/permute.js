
//看了题解后自己写的全排列，芜湖
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    //思路：回溯
    let used = [];
    let result = [];
    let temp = [];
    let k = nums.length;
    js(nums, used);
    function js(nums,used) {
        // console.log(k)
        //递归终止条件
        if(temp.length === k) {
            result.push(Array.from(temp));
            return;
        }
        //递归
        for(let i = 0; i < nums.length; i++) {
            // console.log(used)
            if(used.includes(nums[i])) continue;
            if(!used.includes(nums[i])){
                temp.push(nums[i]);
                used.push(nums[i]);
            }
            js(nums,used);
            temp.pop();
            used.pop();
        }
    }
    return result;
};
let nums = [1,2,3];
console.log(permute(nums))
//执行用时分布
// 1
// ms
// 击败
// 92.27%
// 复杂度分析
// 消耗内存分布
// 58.31
// MB
// 击败
// 73.02%