package com.example.programmercarl.arrary.sum_of_intervals;

public class Improve {
    /*
        前缀和的思想是重复利用计算过的子数组之和，从而降低区间查询需要累加计算的次数。
        前缀和 在涉及计算区间和的问题时非常有用！
        如果，我们想统计，在vec数组上 下标 2 到下标 5 之间的累加和，那是不是就用 p[5] - p[1] 就可以了。
     */
    /*
    卡码平台：
    import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            temp[i] += sum;
        }
        while(sc.hasNext()){
            sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a != 0){
                sum = temp[b]  - temp[a - 1];
            }else {
                sum = temp[b];
            }
            System.out.println(sum);
        }

    }
}
     */
}
//结果：
/*
本次提交
答案正确
运行时间：
1584ms
消耗内存：
58464kb
 */
