package com.example.programmercarl.arrary.sum_of_intervals;

public class SumOfIntervals {
    //区间和
    /*
    题目描述

    给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。

    输入描述

    第一行输入为整数数组 Array 的长度 n，接下来 n 行，每行一个整数，表示数组的元素。
    随后的输入为需要计算总和的区间，直至文件结束。

    输出描述

    输出每个指定区间内元素的总和。
     */
    /*
        在卡码平台的答案：(ACM模式)
        import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for(int i = a; i <= b; i++){
                sum += arr[i];
            }
            System.out.println(sum);
        }

    }
}
    笑死，超时了。不能暴力
     */
    //查看解析才知道特地卡的暴力，这种题应该用前缀和。
    //前缀和的思想是重复利用计算过的子数组之和，从而降低区间查询需要累加计算的次数。
    public static void main(String[] args) {

    }
}
