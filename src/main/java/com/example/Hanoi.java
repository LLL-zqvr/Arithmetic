package com.example;

import java.util.Scanner;

public class Hanoi {
    //汉诺塔问题1
    /*
    力扣 https://leetcode.cn/problems/hanota-lcci/description/

    在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。
    一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只能放在更大的盘子上面)。
    移动圆盘时受到以下限制:
 (1) 每次只能移动一个盘子;
(2) 盘子只能从柱子顶端滑出移到下一根柱子;
(3) 盘子只能叠在比它大的盘子上。

    请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。

    你需要原地修改栈。

    示例1:

    输入：A = [2, 1, 0], B = [], C = []
    输出：C = [2, 1, 0]
    示例2:

    输入：A = [1, 0], B = [], C = []
    输出：C = [1, 0]

=================================================================================
    class Solution {
        public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
            hanoi(A.size(),A,B,C);
        }
        void hanoi(int n, List<Integer>A, List<Integer>B, List<Integer>C){
            if(n == 0){//A只剩下最后那个圆盘
                return;
            }else{
                hanoi(n - 1, A, C, B);//把n-1个盘子放到B上
                move(A,C);//将最后一个盘子放到C中
                hanoi(n - 1, B, A, C);//将
            }

        }
        void move(List<Integer> A, List<Integer> C){
            Integer temp = A.remove(A.size() - 1);
            C.add(temp);
        }
    }
++++++++++++++++++++++++++++++
    执行用时分布:1ms
击败
29.71%
使用 Java 的用户
    消耗内存分布:40.40MB
击败
48.46%
使用 Java 的用户
================================================================================
*/

    public static void hanoi(int n, char a, char b, char c){
        if(n == 0){
            return;
        } else {
            {
                hanoi(n - 1, a, c, b);
                //System.out.println("1");
            }
            {move(a, c);
               // System.out.println("2");
                }
            {
                hanoi(n - 1, b, a, c);
               // System.out.println("3");
            }
        }
    }

    public static void move(char a, char b){
        System.out.println(a + "移动到" + b); // 修改为输出正确的移动信息
    }

    public static void main(String[] args) {
        hanoi(2, 'a', 'b', 'c');
    }

}

