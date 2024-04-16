package com.example;

import java.util.Scanner;

public class Hanoi {
    //汉诺塔问题
        /*
    public static void hanoi(Integer n, String a, String b, String c) {
        if (n == 1) {
            System.out.println(a + "移动到" + c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.println(a + "移动到" + c);
            hanoi(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        hanoi(2, "塔1", "塔2", "塔3");
    }

         */
    public static void hanoi(int n, char a, char b, char c){
        if(n == 0){
            return;
        } else {
            {
                hanoi(n - 1, a, c, b);
                System.out.println("1");
            }
            {move(a, c);
                System.out.println("2");}
            {
                hanoi(n - 1, b, a, c);
                System.out.println("3");
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

