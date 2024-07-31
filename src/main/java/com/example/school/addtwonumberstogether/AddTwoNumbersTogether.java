package com.example.school.addtwonumberstogether;

import java.util.Scanner;

public class AddTwoNumbersTogether {
     /*
    Leetcode
    num1
    题目描述：
    给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target的那 两个 整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    你可以按任意顺序返回答案。
    示例 1：

    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    示例 2：

    输入：nums = [3,2,4], target = 6
    输出：[1,2]
    示例 3：

    输入：nums = [3,3], target = 6
    输出：[0,1]
  */
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("请输入一组数字，数字用逗号分割");
          String str = sc.next();
          //得到字符数组
          String[] list = str.split(",");
          /*
          for(int i = 0; i < list.length; i++){
               System.out.println(list[i]);
          }

           */
          //int a = '5' - '0';
          //将字符数组转为整数数组
          int[] listNum = new int[list.length];
          for(int i = 0; i < list.length; i++){
               listNum[i] = Integer.parseInt(list[i]);
          }
          System.out.println("请输入目标数字：");
          int target = sc.nextInt();
          int[] result = twoSum(listNum, target);
          for(int i = 0; i < result.length; i++){
               System.out.print(result[i] + " ");
          }




     }
     public static int[] twoSum(int[] nums, int target){
         //非递归,暴力枚举
          int[] result = new int[2];
     loop: for(int i = 0; i < nums.length; i++){
              for(int j = i + 1; j < nums.length; j++){
                   if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        break loop;
                   }
              }
         }
          return result;
     }
     /*
     执行用时分布
54
ms
击败
19.54%
使用 Java 的用户
消耗内存分布
43.94
MB
击败
36.26%
使用 Java 的用户
      */
     //哈希表

}
