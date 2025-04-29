var subsets = function(nums) {
    const n = nums.length;
    const ans = []
    const path = []
    function dfs(i) {
        if (i === n) { // 子集构造完毕
            ans.push(Array.from(path)); // 复制 path
            return;
        }

        // 不选 nums[i]
        dfs(i + 1);

        // 选 nums[i]
        path.push(nums[i]);
        dfs(i + 1);
        path.pop(); // 恢复现场
    }
    dfs(0);
    return ans;
};
let nums = [1,2,3]
console.log(subsets(nums));