package com.example.hot100.arrary.longest_consecutive_sequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {
    //128. 最长连续序列
    //中等
    //相关标签
    //相关企业
    //给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
    //
    //请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
    //
    //
    //
    //示例 1：
    //
    //输入：nums = [100,4,200,1,3,2]
    //输出：4
    //解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
    //示例 2：
    //
    //输入：nums = [0,3,7,2,5,8,4,6,0,1]
    //输出：9
    //示例 3：
    //
    //输入：nums = [1,0,1,2]
    //输出：3
    //
    //
    //提示：
    //
    //0 <= nums.length <= 105
    //-109 <= nums[i] <= 109
    //和题解一样欸嘿
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        nums = set.stream().mapToInt(Integer::intValue).toArray();
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println();
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println();
        int result = 1, p = 0, max = result;
        while (p < nums.length - 1) {
            if(nums[p] + 1 == nums[p + 1]) {
                System.out.println(nums[p + 1] + "," + nums[p]);
                result++;
                p++;
            } else {
                result = 1;
                p++;
            }
            if(max <= result) {
                max = result;
            }
        }
//        System.out.println("flag" + flag);
//        System.out.println("max" + max);

            return max;

    }
    public static void main(String[] args) {
        System.out.println("请输入数组");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] a = str.split(",");
        int[] nums = new int[a.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(a[i]);
//            System.out.print(nums[i] + ",");

        }
//        System.out.println();

        System.out.println(longestConsecutive(nums));
    }
}
//执行用时分布
//28
//ms
//击败
//78.26%
//复杂度分析
//消耗内存分布
//59.94
//MB
//击败
//80.93%