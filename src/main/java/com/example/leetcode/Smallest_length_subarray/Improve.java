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
                sum -= nums[left++];//这里特别妙。循环完sum刚好清零。相当于初始化了。
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
