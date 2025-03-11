package com.example.hot100.chain_table.max_area;

public class MaxArea {
    //11. 盛最多水的容器
    //尝试过
    //中等
    //相关标签
    //相关企业
    //提示
    //给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
    //
    //找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
    //
    //返回容器可以储存的最大水量。
    //
    //说明：你不能倾斜容器。
    //
    //
    //
    //示例 1：
    //
    //
    //
    //输入：[1,8,6,2,5,4,8,3,7]
    //输出：49
    //解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
    //示例 2：
    //
    //输入：height = [1,1]
    //输出：1
    //
    //
    //提示：
    //
    //n == height.length
    //2 <= n <= 105
    //0 <= height[i] <= 104

    //超出时间限制了
    //class Solution {
    //    public int maxArea(int[] height) {
    //        int p = 0, max = 0, result = 0, l = 0, r = 1;
    //        while(l != height.length - 1) {
    //            if(r != height.length) {
    //                result = (r - l) * Math.min(height[r],height[l]);
    //                r++;
    //            } else {
    //                l++;
    //                r = l + 1;
    //            }
    //            if(max <= result) {
    //                max = result;
    //            }
    //        }
    //        return max;
    //    }
    //
    //}
}
