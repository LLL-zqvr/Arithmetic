package com.example.programmercarl.arrary.square_of_an_ordered_array;

import java.util.Scanner;

public class Improve {
    //双指针法：
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int tmp = arr.length - 1;
        for(int left = 0, right = nums.length - 1; left <= right;){
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                arr[tmp--] = nums[left] * nums[left];
                left++;

            }else{
                arr[tmp--] = nums[right] * nums[right];
                right--;
            }
        }
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
//结果：
/*
执行用时分布
1
ms
击败
100.00%
复杂度分析
消耗内存分布
46.28
MB
击败
66.15%

 */