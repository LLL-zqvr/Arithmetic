package com.example.programmercarl.hash_table.the_sum_of_four_numbers;

import java.lang.reflect.Array;
import java.util.*;

public class TheSumOfFourNumbers {
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            //一看这题就知道是上一题的进阶
            //思路也还容易想，无非就是两个数组的数加起来等于另两个数组相加的负数。
            //result记录有几个元组可以满足
            int result = 0;
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

            int mul = 0;
            for (Integer integer : map.values()) {
                if(set.contains(integer)){
                    mul++;
                }
                if(integer == map.size() - 1){
                    result = result * mul;
                    mul = 0;
                    integer = 1;
                }
            }
            return result;
        }
    }
}
