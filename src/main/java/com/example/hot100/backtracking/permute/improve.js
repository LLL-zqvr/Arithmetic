
    //46. 全排列
    //中等
    //相关标签
    //相关企业
    //给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
    //
    //
    //
    //示例 1：
    //
    //输入：nums = [1,2,3]
    //输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    //示例 2：
    //
    //输入：nums = [0,1]
    //输出：[[0,1],[1,0]]
    //示例 3：
    //
    //输入：nums = [1]
    //输出：[[1]]
    //
    //
    //提示：
    //
    //1 <= nums.length <= 6
    //-10 <= nums[i] <= 10
    //nums 中的所有整数 互不相同

    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    var improve = function(nums) {
        const res = [], path = [];
        backtracking(nums, nums.length, []);
        return res;

        function backtracking(n, k, used) {
            if(path.length === k) {
                res.push(Array.from(path));
                return;
            }
            for (let i = 0; i < k; i++ ) {
                if(used[i]) continue;
                path.push(n[i]);
                used[i] = true; // 同支
                backtracking(n, k, used);
                path.pop();
                used[i] = false;
            }
        }
    };
    let nums = [1,2,3];
    console.log(improve(nums));