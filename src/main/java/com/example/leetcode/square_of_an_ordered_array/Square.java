package com.example.leetcode.square_of_an_ordered_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Square {
    //leeCode 977. 有序数组的平方
    /*
    给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。



    示例 1：

    输入：nums = [-4,-1,0,3,10]
    输出：[0,1,9,16,100]
    解释：平方后，数组变为 [16,1,0,9,100]
    排序后，数组变为 [0,1,9,16,100]
    示例 2：

    输入：nums = [-7,-3,2,3,11]
    输出：[4,9,9,49,121]
     */
    //进阶：请你设计时间复杂度为 O(n) 的算法解决本问题
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = (int) Math.pow(nums[i],2);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("请输入数组nums的值：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toString();
        String[] a = str.split(" ");
        int[] arr = new  int[a.length];
        for(int i = 0; i < a.length; i++){
            arr[i] = Integer.parseInt(a[i]);
        }
    }
}
//结果
/*
执行用时分布
        int[] num = sortedSquares(arr);

5
ms
击败
21.97%
复杂度分析
消耗内存分布
45.49
MB
击败
89.68%

 */