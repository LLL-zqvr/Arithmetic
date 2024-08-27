package com.example.programmercarl.hash_table.valid_letter_scrambles;

import java.util.HashSet;
import java.util.Scanner;

public class ValidLetterScrambles {
    /*
    242. 有效的字母异位词
    简单
    相关标签
    相关企业
    给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

    字母异位词 是通过重新排列不同单词或短语的字母而形成的单词或短语，通常只使用所有原始字母一次。



    示例 1:

    输入: s = "anagram", t = "nagaram"
    输出: true
    示例 2:

    输入: s = "rat", t = "car"
    输出: false
     */
    public static boolean isAnagram(String s, String t) {
        int[] sNum = new int[150];
        int[] tNum = new int[150];

        for(int i = 0; i < s.length(); i++){

            //java中，charAt()方法用于返回指定索引处的字符。
            sNum[s.charAt(i)]++;
        }
        for(int i = 0; i < t.length(); i++){
            tNum[t.charAt(i)]++;
        }
//        System.out.println(sNum.length + " " + tNum.length);
        if(s.length() != t.length()){
            return false;
        }
        //得到去重的数组
        char[] sChars = s.toCharArray();
        HashSet set = new HashSet();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < sChars.length; i++){
            if(set.add(sChars[i])){
                builder.append(sChars[i]);
            }
        }
        for(int i = 0; i < builder.length(); i++){
//            System.out.println(builder);
            if(sNum[builder.charAt(i)] != tNum[builder.charAt(i)]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("请输入第一个字符串s：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("请输入第二个字符串t:");
        String t = sc.next();
        Boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
/*
执行用时分布
5
ms
击败
34.13%
复杂度分析
消耗内存分布
42.24
MB
击败
46.57%
 */