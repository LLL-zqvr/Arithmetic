package com.example.leetcode.Smallest_length_subarray;

import java.util.Scanner;

public class Improve {
    /*
    方法：滑动窗口
    所谓滑动窗口，就是不断的调节子序列的起始位置和终止位置，从而得出我们要想的结果。
    发现这个思路和我的非常相近。看了代码之后才发现该代码for中用了while来找到终止位置。
    但是因为只执行了一次所以也是复杂度为n。这是个很好地思路。
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];//这里体现出滑动窗口的精髓之处，不断变更left（子序列的起始位置），尝试找到更优解
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
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
//结果:
/*
执行用时分布
1
ms
击败
99.80%
复杂度分析
消耗内存分布
56.77
MB
击败
28.54%
 */