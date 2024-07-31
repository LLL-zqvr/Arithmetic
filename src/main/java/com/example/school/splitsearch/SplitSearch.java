package com.example.school.splitsearch;

import java.util.Scanner;

public class SplitSearch {
    //折半查找(前提是递增有序)
    //查找区间为：a[low...high]
    public static void main(String[] args) {
        System.out.println("请输入一个递增有序的容量为5的数组:");
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        for(int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("请输入你要查询的数字");
        int k = sc.nextInt();
        Search(list, 0, list.length, k);
    }
    public static void Search(int[] list, int low, int high, int k){
        int mid ;
        if(low <= high){
            mid = (low + high) / 2;
            if(list[mid] == k){
                System.out.println("该数的索引是：" + mid);
            }else if(list[mid] > k){
                Search(list, low, mid, k);
            } else{
                Search(list, mid, high, k);
            }

        }else {
            System.out.println("无法找到目标数字");
        }
    }

}
