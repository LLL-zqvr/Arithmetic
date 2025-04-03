let twoSum = function (nums, target) {
    //双数之和
    //思想：map
    let map = new Map();
    for(let i = 0; i < nums.length; i++) {
        if(map.has(target - nums[i])) {
            return [map.get(target - nums[i]), i];
        }
        map.set(nums[i], i);
    }
}

//执行用时分布
// 2
// ms
// 击败
// 93.19%
// 复杂度分析
// 消耗内存分布
// 55.61
// MB
// 击败
// 27.96%