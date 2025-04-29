package com.example.hot100.hash.anagram_groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
49. 字母异位词分组
已解答
中等
相关标签
相关企业
给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

字母异位词 是由重新排列源单词的所有字母得到的一个新单词。


示例 1:

输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
示例 2:

输入: strs = [""]
输出: [[""]]
示例 3:

输入: strs = ["a"]
输出: [["a"]]


提示：

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] 仅包含小写字母
*
* */
//思路：三个列表，kind,list,result。先把字符串用.split(""),变成字符串数组，然后就可以用Arrays.sort(groups[i])排序了。
// 然后判断kind中是否包含groups[i]，如果不包含，则添加到kind中，并添加到result中，并清空list。如果包含，则添加到list中。
public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0) {
            return result;
        }
        String[][] groups = new String[strs.length][];
        for(int i = 0; i < strs.length; i++) {
             groups[i] = strs[i].split("");
            Arrays.sort(groups[i]);
//            System.out.println(Arrays.toString(groups[i]));
        }
        List<String> kind = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < groups.length; i++){
            if(kind.contains(Arrays.toString(groups[i])) != true) {
//                System.out.println(Arrays.toString(groups[i]));
                kind.add(Arrays.toString(groups[i]));
//                System.out.println(strs[i]);
                list.add(strs[i]);
                for(int j = i + 1; j < groups.length; j++) {
                    if(Arrays.equals(groups[i], groups[j])) {
                        list.add(strs[j]);
                    }
                }
//                System.out.println(list);
                result.add(list);
//                System.out.println(result);
                list = new ArrayList<>();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串数组：");
        String str = sc.nextLine();
        String[] strs = str.substring(1, str.length() - 1).replace("\"", "").split(", ");
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}

/**
 *
 * 执行用时分布
 * 1150
 * ms
 * 击败
 * 5.07%
 * 复杂度分析
 * 消耗内存分布
 * 51.86
 * MB
 * 击败
 * 5.01%
 * **/