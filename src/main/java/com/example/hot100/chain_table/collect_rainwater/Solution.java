package com.example.hot100.chain_table.collect_rainwater;

public class Solution {
    //42. 接雨水
    //已解答
    //困难
    //相关标签
    //相关企业
    //给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
    //
    //
    //
    //示例 1：
    //
    //
    //
    //输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
    //输出：6
    //解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
    //示例 2：
    //
    //输入：height = [4,2,0,3,2,5]
    //输出：9

    //前后缀法
    //class Solution {
    //    public int trap(int[] height) {
    //        //前后缀法
    //        //先算前缀
    //        int[] pre = new int[height.length];
    //        pre[0] = height[0];
    //        for(int i = 1; i < pre.length; i++) {
    //            pre[i] = Math.max(pre[i - 1], height[i]);
    //        }
    //        //然后到后缀
    //        int[] suf = new int[height.length];
    //        suf[height.length - 1] = height[height.length - 1];
    //        for(int i = height.length - 2; i >= 0; i--) {
    //            suf[i] = Math.max(suf[i + 1], height[i]);
    //        }
    //        //最后计算——前后缀的最小值减去高度既是每高度的雨水单位
    //        int count = 0;
    //        for(int i = 0; i < height.length; i++) {
    //            count += Math.min(pre[i], suf[i]) - height[i];
    //        }
    //        return count;
    //
    //    }
    //}
    
}
//执行用时分布
//1
//ms
//击败
//69.44%
//复杂度分析
//消耗内存分布
//45.27
//MB
//击败
//58.04%