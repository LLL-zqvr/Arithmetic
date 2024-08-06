package com.example.programmercarl.arrary.the_developer_buys_land;

public class DeveloperBuysLand {
    //44. 开发商购买土地（第五期模拟笔试）
    /*
    题目描述
    在一个城市区域内，被划分成了n * m个连续的区块，每个区块都拥有不同的权值，代表着其土地价值。目前，有两家开发公司，A 公司和 B 公司，希望购买这个城市区域的土地。

    现在，需要将这个城市区域的所有区块分配给 A 公司和 B 公司。

    然而，由于城市规划的限制，只允许将区域按横向或纵向划分成两个子区域，而且每个子区域都必须包含一个或多个区块。 为了确保公平竞争，你需要找到一种分配方式，使得 A 公司和 B 公司各自的子区域内的土地总价值之差最小。

    注意：区块不可再分。
     */
    /*
    输入描述
    第一行输入两个正整数，代表 n 和 m。
    接下来的 n 行，每行输出 m 个正整数。
     */
    /*
    在卡码网的答案如下：
    import java.util.Scanner;
    import java.util.Arrays;
    //试试用前缀和看看
    public class Main{
        public static int subtract(int[] temp){
            Arrays.sort(temp);
            int result;
            int min = 999999;
            for(int i = 0; i < temp.length - 1; i++){
                result = temp[temp.length - 1] - temp[i];
                if(result > temp[i]){
                    result = result - temp[i];
                }else{
                    result = temp[i] - result;
                }
                if(result < min){
                    min = result;
                }
            }
            return min;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0;
            int p = 0;
            int[] row = new int[n];
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = sc.nextInt();
                    sum += arr[i][j];
                }
                //先算行
                row[p++] = sum;
            }
            // for(int i = 0; i < n; i++){
            //     System.out.print(row[i] + " ");
            // }
            // System.out.println();
            int result1 = subtract(row);
            //再看列
            sum = 0;
            int[] column = new int[m];
            p = 0;
            for(int j = 0; j < m; j++){
                for(int i = 0; i < n; i++){
                    sum += arr[i][j];
                }
                column[p++] = sum;
            }
            // for(int i = 0; i < m; i++){
            //     System.out.print(column[i] + " ");
            // }
            // System.out.println();
            int result2 = subtract(column);
            if(result2 < result1){
                System.out.println(result2);
            }else{
                System.out.println(result1);
            }
            // System.out.println(result1);
            // System.out.println(result2);

        }
    }
     */
    //结果：
    /*
    答案正确
    运行时间：
    2104ms
    消耗内存：
    25700kb
     */
}
