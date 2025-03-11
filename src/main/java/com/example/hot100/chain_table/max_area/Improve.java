package com.example.hot100.chain_table.max_area;

public class Improve {
//    一开始，指针在左右两侧，每次移动指针，都计算一次面积，然后移动指针，直到左右指针相遇。
    //那么该移动哪个指针呢？我们可以得知，
    //public class Solution {
    //    public int maxArea(int[] height) {
    //        int l = 0, r = height.length - 1;
    //        int ans = 0;
    //        while (l < r) {
    //            int area = Math.min(height[l], height[r]) * (r - l);
    //            ans = Math.max(ans, area);
    //            if (height[l] <= height[r]) {
    //                ++l;
    //            }
    //            else {
    //                --r;
    //            }
    //        }
    //        return ans;
    //    }
    //}
    //
    //执行用时分布
    //5
    //ms
    //击败
    //16.87%
    //复杂度分析
    //消耗内存分布
    //56.13
    //MB
    //击败
    //80.87%
}
