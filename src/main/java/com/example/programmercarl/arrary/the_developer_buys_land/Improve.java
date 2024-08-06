package com.example.programmercarl.arrary.the_developer_buys_land;

public class Improve {
    //思路一样
    //但是可读性更强一些
    /*
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        int[][] vec = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vec[i][j] = scanner.nextInt();
                sum += vec[i][j];
            }
        }

        // 统计横向
        int[] horizontal = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                horizontal[i] += vec[i][j];
            }
        }

        // 统计纵向
        int[] vertical = new int[m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                vertical[j] += vec[i][j];
            }
        }

        int result = Integer.MAX_VALUE;
        int horizontalCut = 0;
        for (int i = 0; i < n; i++) {
            horizontalCut += horizontal[i];
            result = Math.min(result, Math.abs(sum - 2 * horizontalCut));
        }

        int verticalCut = 0;
        for (int j = 0; j < m; j++) {
            verticalCut += vertical[j];
            //Math.abs()返回一个数的绝对值
            result = Math.min(result, Math.abs(sum - 2 * verticalCut));
        }

        System.out.println(result);
        scanner.close();
    }
}
     */
}
//结果：
/*
本次提交
答案正确
运行时间：
2271ms
消耗内存：
29008kb
 */