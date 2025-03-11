package com.example.hot100.chain_table.move_zeroes;

public class MoveZeroes {
    //283. 移动零
    //已解答
    //简单
    //相关标签
    //相关企业
    //提示
    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    //
    //请注意 ，必须在不复制数组的情况下原地对数组进行操作。
    //
    //
    //
    //示例 1:
    //
    //输入: nums = [0,1,0,3,12]
    //输出: [1,3,12,0,0]
    //示例 2:
    //
    //输入: nums = [0]
    //输出: [0]
    //
    //
    //提示:
    //
    //1 <= nums.length <= 104
    //-231 <= nums[i] <= 231 - 1
    //
//思想：r指针找非零数，l指针则指向最左边的零，r找到非零数则和l换，然后r++，l++,r继续找非零数，在末尾前，l必定能指向0。
//和题解思路一样~
    public static void moveZeroes(int[] nums) {
        //class Solution {
        //    public void moveZeroes(int[] nums) {
        //        int l = 0, tem, r = 0;
        //        while(r < nums.length) {
        //            if(nums[r] == 0) {
        //                r++;
        //            } else {
        //                tem = nums[l];
        //                nums[l] = nums[r];
        //                nums[r] = tem;
        //                r++;
        //                l++;
        //            }
        //        }
        //
        //    }
        //}
    }
}
//执行用时分布
//1
//ms
//击败
//100.00%
//复杂度分析
//消耗内存分布
//44.88
//MB
//击败
//95.51%