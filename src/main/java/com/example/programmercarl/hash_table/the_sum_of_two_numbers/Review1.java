package com.example.programmercarl.hash_table.the_sum_of_two_numbers;

import java.util.HashMap;
import java.util.Scanner;

public class Review1 {
    //两数之和
    //思路：首先先用result[]储存答案，然后用map储存遍历过的数，和它的下标
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组：");
        String str = sc.nextLine();
        String[] strs = str.split(",");
        int[] nums = new int[strs.length];
        for(int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
    }
}
