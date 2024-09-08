package com.example.programmercarl.hash_table.the_sum_of_four_numbers;

import java.lang.reflect.Array;
import java.util.*;

public class TheSumOfFourNumbers {
    /*
    454. 四数相加 II
尝试过
中等
相关标签
相关企业
给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：

0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0


示例 1：

输入：nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
输出：2
解释：
两个元组如下：
1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
示例 2：

输入：nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
输出：1

     */
        public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            //一看这题就知道是上一题的进阶
            //思路也还容易想，无非就是两个数组的数加起来等于另两个数组相加的负数。
            //result记录有几个元组可以满足
            //悲了，错力
            //发现当时分析的时候少了几个细节，本来把这道题分成两个部分，前部分的几种可能再乘于后部分的几种可能然后得出答案
            //只需要前两个数组的值，所以先用一个set来装前两个数组的和的所有组合
            //由题所知，数组长都相等。则可以简化一下计算。
//            int len = nums1.length;
//            Set<Integer> set = new HashSet<>();
//            int p = 0;
//            int temp = 0;
//            for(int i = 0; i < len; i++){
//                for(int j = 0; j < len; j++){
//                    temp = nums1[i] + nums2[j];
//                    set.add(temp);
//                }
//            }
//
//            for (Integer integer : set) {
//
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//            //接下来就是看剩下的两个数组相加的数是不是set中数的负数了
//            for(int i = 0; i < len; i++){
//                for(int j = 0; j < len; j++){
//                    temp = nums3[i] + nums4[j];
//                    temp = temp * (-1);
//                    if(set.contains(temp)){
//                        result++;
//                        System.out.println(nums3[i] + " " + nums4[j]);
//                    }else {
//                        System.out.println(" +++++++" + nums3[i] + " " + nums4[j]);
//                    }
//                }
//            }
//            System.out.println();
//            return result;
//

            int result = 0;
            int len = nums1.length;
            Map<Integer, Integer> map = new HashMap<>();
            int p = 0;
            int temp = 0;
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    temp = nums1[i] + nums2[j];
                    map.put(p++, temp);
                }
            }
//            for (Integer integer : map.values()) {
//
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//            接下来就是看剩下的两个数组相加的数是不是map中数的相反数了
//            用set记录符合题目的两数相加的结果
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    temp = nums3[i] + nums4[j];
                    temp = temp * (-1);
                    if(map.containsValue(temp)){
                        set.add(temp);
                        result++;
//                        System.out.println(nums3[i] + " " + nums4[j]);
                    }
//                    else {
//                        System.out.println(" +++++++" + nums3[i] + " " + nums4[j]);
//                    }
                }
            }
//            System.out.println(result);
//            for (Integer integer : set) {
//
//                System.out.print(integer + " ");
//            }
//            System.out.println();

//            int mul = 0;
//            for (Integer integer : map.values()) {
//                if(set.contains(integer)){
//                    mul++;
//                }
//                if(integer == map.size() - 1){
//                    result = result * mul;
//                    mul = 0;
//                    integer = 1;
//                }
//            }
            //需要寻找一个数据结构是可以装下三个数的，想到了二维数组
            //前半部分
            int[][] a = new int[9999][9999];
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    if(set.contains(nums1[i] + nums2[j])){
                        a[nums1[i]][nums2[j]] = nums1[i] + nums2[j];
                    }
                }
            }
            int mul = 0;
            for(Integer integer : set){
                mul = 0;
                for(int i = 0; i < 9999; i++){
                    for(int j = 0; j < 9999; j++){
                        if(integer == a[i][j]){
                            mul++;
                        }
                    }
                }
                result = result * mul;
            }
            //后半部分
            int[][] b = new int[9999][9999];
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++){
                    if(set.contains(nums3[i] + nums4[j])){
                        a[nums3[i]][nums4[j]] = nums3[i] + nums4[j];
                    }
                }
            }
            for(Integer integer : set){
                mul = 0;
                for(int i = 0; i < 9999; i++){
                    for(int j = 0; j < 9999; j++){
                        if(integer == b[i][j]){
                            mul++;
                        }
                    }
                }
                result = result * mul;
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums1 = {-1, -1};
        int[] nums2 = {-1, 1};
        int[] nums3 = {-1, 1};
        int[] nums4 = {1, -1};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }
}
