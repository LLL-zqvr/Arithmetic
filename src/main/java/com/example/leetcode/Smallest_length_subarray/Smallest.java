package com.example.leetcode.Smallest_length_subarray;

import java.util.Scanner;

public class Smallest {
    /*
    leeCode 209 长度最小的子数组
    给定一个含有 n 个正整数的数组和一个正整数 target 。

    找出该数组中满足其总和大于等于 target 的长度最小的
    子数组
     [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     示例 1：

    输入：target = 7, nums = [2,3,1,2,4,3]
    输出：2
    解释：子数组 [4,3] 是该条件下的长度最小的子数组。
    示例 2：

    输入：target = 4, nums = [1,4,4]
    输出：1
    示例 3：

    输入：target = 11, nums = [1,1,1,1,1,1,1,1]
    输出：0
     */
    //暴力要用两个for，n方，这次就不写暴力了，想试试能不能找到时间复杂度为n的
    //尝试用左右指针法，先把基础答案先找到，用p来记录。然后通过改变left和right的范围来找到更好的答案。也就是用一个for
    //来完成两个循环过程，但是p的值固定不了。做这道题花了三小时，尝试了很多方法，未果。遂不再死磕。
    //以下代码：
    public static int minSubArrayLen(int target, int[] nums) {
        int result = 0;
        int left = 0;
        int sum = nums[0];
        int temp;
        int p = 1;
        int right = 1;
        for(int i = left; i < p; i++){
            if(p == nums.length)break;
            if(sum < target){
                sum += nums[p];
                p++;

            }else {//sum >= target
                temp = right - p;
                right = p;
                System.out.println(p + "," + left);
                if(temp < result || result == 0){
                    result = temp;
                    left++;
                    p = left + 1;
                    sum = nums[left];
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("请输入数组nums：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] nums = new int[arr.length];
        for(int i = 0; i < nums.length; i++){
             nums[i] = Integer.parseInt(arr[i]);
        }
        System.out.println("请输入数字target的值：");
        int target = sc.nextInt();
        int result = minSubArrayLen(target, nums);
        System.out.println(result);
    }

}
