package com.example.hot100.chain_table.three_sum;

public class Improve {
    //15. 三数之和
    //中等
    //相关标签
    //相关企业
    //提示
    //给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
    //
    //注意：答案中不可以包含重复的三元组。
    //
    //
    //
    //
    //
    //示例 1：
    //
    //输入：nums = [-1,0,1,2,-1,-4]
    //输出：[[-1,-1,2],[-1,0,1]]
    //解释：
    //nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
    //nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
    //nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
    //不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
    //注意，输出的顺序和三元组的顺序并不重要。
    //示例 2：
    //
    //输入：nums = [0,1,1]
    //输出：[]
    //解释：唯一可能的三元组和不为 0 。
    //示例 3：
    //
    //输入：nums = [0,0,0]
    //输出：[[0,0,0]]
    //解释：唯一可能的三元组和为 0 。
    //
    //
    //提示：
    //
    //3 <= nums.length <= 3000
    //-105 <= nums[i] <= 105


    //没写出来，以下为题解
    //class Solution {
    //    public List<List<Integer>> threeSum(int[] nums) {
    //        Arrays.sort(nums); // 先排序
    //        List<List<Integer>> res = new ArrayList<>();
    //
    //        for (int i = 0; i < nums.length; i++) {
    //            // 跳过重复元素
    //            if (i > 0 && nums[i] == nums[i - 1]) continue;
    //
    //            // 双指针，目标是找到 nums[l] + nums[r] = -nums[i]
    //            int l = i + 1, r = nums.length - 1;
    //            int target = -nums[i];
    //
    //            while (l < r) {
    //                int sum = nums[l] + nums[r];
    //                if (sum == target) {
    //                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
    //                    l++;
    //                    r--;
    //                    // 跳过重复元素
    //                    while (l < r && nums[l] == nums[l - 1]) l++;
    //                    while (l < r && nums[r] == nums[r + 1]) r--;
    //                } else if (sum < target) {
    //                    l++;
    //                } else {
    //                    r--;
    //                }
    //            }
    //        }
    //
    //        return res;
    //    }
    //}
}
//执行用时分布
//34
//ms
//击败
//54.65%
//复杂度分析
//消耗内存分布
//50.34
//MB
//击败
//89.93%