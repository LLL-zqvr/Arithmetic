package com.example.hot100.chain_table.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ThreeSum {
    //当时没写出来，然后看题解了。现在重写一遍
    //思路：先对数组进行排序，然后使用双指针法（nums[l]+nums[r],如果等于目标值则记录，小于目标值就l++,大于就r--），
    // 固定一个数，然后使用双指针法找到另外两个数
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int target = 0;
        int l,r;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            //跳过重复元素
            if(i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            target = -nums[i];
            l = i + 1;
            r = nums.length - 1;
            while(l < r) {

                if(nums[l] + nums[r] == target) {
                    result.add(Arrays.asList(nums[l],nums[i],nums[r]));
                    l++;
                    r--;
                    //跳过重复元素
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r &&nums[r] == nums[r + 1]) r--;
                } else if (nums[l] + nums[r] < target) {
                    l++;
                } else {
                    r--;
                }

            }
        }

        return  result;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("");
        int[] nums = new int[strs.length];
        for(int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(threeSum(nums));
    }
}
//执行用时分布
//35
//ms
//击败
//48.24%
//复杂度分析
//消耗内存分布
//50.30
//MB
//击败
//96.43%