package com.example.school.program_design;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class port {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入数目n的值:");
        int len = sc.nextInt();
        sc.nextLine();
//        System.out.println(len);

        String str;
        int[][] arr = new int[len][300000];
        //每次都初始化set
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            str = sc.nextLine();
//            System.out.println(str);
            //第一个数表示秒；第二个数表示该行接下来的个数
            String[] a = str.split(" ");
            for (int j = 2; j < a.length; j++) {
//                System.out.println(a[j] + "***");
                set.add(Integer.parseInt(a[j]));
            }
            if(i != len - 1){
                System.out.println(set.size());
            }else {
                System.out.print(set.size());
            }

        }

    }
}
//String str = sc.nextLine().toString();
//String[] a = str.split(" ");
//int[] nums = new int[a.length];
//        for(int i = 0; i < a.length; i++){
//nums[i] = Integer.parseInt(a[i]);
//        }