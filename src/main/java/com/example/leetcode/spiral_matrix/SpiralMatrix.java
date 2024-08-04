package com.example.leetcode.spiral_matrix;

import java.util.Scanner;

public class SpiralMatrix {
    /*
            59. 螺旋矩阵 II
            给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
            示例 1：
            输入：n = 3
            输出：[[1,2,3],[8,9,4],[7,6,5]]
            示例 2：

            输入：n = 1
            输出：[[1]]

    */
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int[] num = new int[n * n];
        for(int i = 1; i <= n * n; i++){
            num[i - 1] = i;
        }
        int p = 0;
        for(int i = 0; i < (n + 1) / 2; i++){//i表示为层数
            for(int j = i; j < n - i - 1; j++){
                arr[i][j] = num[p++];//第一行
            }
            for(int j = i; j < n - i - 1; j++){
                arr[j][n - i - 1] = num[p++];//最右边那一列
            }
            for(int j = n - i - 1; j > i; j--){
                arr[n - i - 1][j] = num[p++];//底下那一层
            }
            for(int j = n - i - 1; j > i; j--){
                arr[j][i] = num[p++];//最左边那一层
            }
        }
        //单数时要额外分析
        if(n % 2 != 0){
            arr[(n + 1) / 2 - 1][(n + 1) / 2 - 1] = n * n;
        }
            return arr;
    }

    public static void main(String[] args) {
        System.out.println("请输入数字n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = generateMatrix(n);
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//结果：
/*
执行用时分布
0
ms
击败
100.00%
复杂度分析
消耗内存分布
40.30
MB
击败
93.65%
嘿嘿嘿，花了大概三个小时吧，第二次就过了。真有成就感。
 */