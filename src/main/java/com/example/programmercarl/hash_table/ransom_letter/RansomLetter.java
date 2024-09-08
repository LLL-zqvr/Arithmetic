package com.example.programmercarl.hash_table.ransom_letter;

import java.util.HashSet;
import java.util.Set;

public class RansomLetter {
    /*
    383. 赎金信
    简单
    相关标签
    相关企业
    给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

    如果可以，返回 true ；否则返回 false 。

    magazine 中的每个字符只能在 ransomNote 中使用一次。
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        //emmm没理解错的话就是m中包不包含r
        //写过了啊类似的题
        String[] m = magazine.split("");
        //得到去重后的m，既m中有多少种字符种类
        Set<String> set = new HashSet<>();
        for(int i = 0; i < m.length; i++){
            set.add(m[i]);
        }
        int[] sum = new int[150];
        for(int i = 0; i < m.length; i++){
            if(set.contains(m[i])){
                sum[m[i].charAt(0)]++;
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            sum[ransomNote.charAt(i)]--;
            if(sum[ransomNote.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "aa";
        System.out.println(canConstruct(str1, str2));
    }
}
/*
执行用时分布
71
ms
击败
5.34%
复杂度分析
消耗内存分布
46.16
MB
击败
5.01%
 */