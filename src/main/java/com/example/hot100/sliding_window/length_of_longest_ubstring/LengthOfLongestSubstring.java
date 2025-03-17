package com.example.hot100.sliding_window.length_of_longest_ubstring;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";
        int left = 0, right = 0;
        int  max = 0;
        List<Character> list = new ArrayList<>();
        while(right < s.length()) {
            if(list.contains(s.charAt(right))) {
                System.out.println("*");
                while(list.contains(s.charAt(right))) {
                    list.remove(left);
                    System.out.println(list);
                }
                list.add(s.charAt(right));
                right++;
                System.out.println(list);
//                System.out.println(list);
            } else {
                System.out.println("**");
                list.add(s.charAt(right));
                right++;
                System.out.println(list);
            }
            max = Math.max(list.size(),max);
        }
        System.out.println(max);

    }
}
//执行用时分布
//216
//ms
//击败
//5.06%
//复杂度分析
//消耗内存分布
//44.50
//MB
//击败
//8.11%