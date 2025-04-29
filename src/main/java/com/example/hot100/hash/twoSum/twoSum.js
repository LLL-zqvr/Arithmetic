/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();
    let result = [];
    for(let i = 0; i < nums.length; i++){
        if(map.has(nums[i])) {
            console.log(map)
            result.push(i);
            result.push(map.get(nums[i]));
            return result;
        } else {
            // console.log(map,nums[i])
            map.set(target - nums[i], i);
        }
    }
    // return -1;
};
let nums = [2,7,11,15];
let target = 9;
console.log(twoSum(nums,target));