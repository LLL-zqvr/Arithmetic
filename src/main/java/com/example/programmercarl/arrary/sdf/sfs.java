package com.example.programmercarl.arrary.sdf;

public class sfs {
    /*
    704. 二分查找
已解答
简单
相关标签
相关企业
给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。


示例 1:

输入: nums = [-1,0,3,5,9,12], target = 9
输出: 4
解释: 9 出现在 nums 中并且下标为 4
示例 2:

输入: nums = [-1,0,3,5,9,12], target = 2
输出: -1
解释: 2 不存在 nums 中因此返回 -1

     */

        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int middle ;
            middle = (left + right) / 2;
            for(int i = left; i <= right; i++){
                middle = (left + right) / 2;
                if(target == nums[middle]){
                    return middle;
                } else if (target < nums[middle]) {
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }
            if(left == right){
                middle = (left + right) / 2;
            }
            if(target == nums[middle]){
                return middle;
            }
            return -1;
        }

    public static void main(String[] args) {

    }
}
