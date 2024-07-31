package com.example.leetcode.BinarySearch;

import java.util.Scanner;


public class BinarySearch {
    //704. 二分查找
    /*
    给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
    写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

    示例 1:
    输入: nums = [-1,0,3,5,9,12], target = 9
    输出: 4
    解释: 9 出现在 nums 中并且下标为 4

    示例 2:
    输入: nums = [-1,0,3,5,9,12], target = 2
    输出: -1
    解释: 2 不存在 nums 中因此返回 -1


    提示：

    你可以假设 nums 中的所有元素是不重复的。
    n 将在 [1, 10000]之间。
    nums 的每个元素都将在 [-9999, 9999]之间。
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right)/2;

        for(int i = left; i <= right; i++){
            if(target < nums[middle] && target >= nums[left]){
                right = middle - 1;
                middle = (left + right) / 2;
                if(target == nums[middle]){
                    return middle;
                }
            } else if (target > nums[middle] && target <= nums[right]) {
                left = middle + 1;
                middle = (left + right) / 2;
                if(target == nums[middle]){
                    return middle;
                }
            } else if (target == nums[middle]) {
                return middle;
            } else {
                return -1;
            }
        }

        return -1;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数目n的值:");
        int n = sc.nextInt();
        System.out.println("请输入目标值:");
        int target = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("请输入数组:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
       int result =  search(nums,target);
        System.out.println(result);
    }
}
//结果
/*
执行用时分布
0
ms
击败
100.00%

消耗内存分布
44.46
MB
击败
94.87%

 */