package com.example.hot100.arrary.anagram_groups;

public class Improve {
    //思路一样，但是用的方法不同，像这个就写的很优雅
    //class Solution {
    //    public List<List<String>> groupAnagrams(String[] strs) {
    //        Map<String, List<String>> m = new HashMap<>();
    //        for (String str : strs) {
    //            char[] s = str.toCharArray();
    //            Arrays.sort(s);
    //            // s 相同的字符串分到同一组
    //            m.computeIfAbsent(new String(s), k -> new ArrayList<>()).add(str);
    //        }
    //        return new ArrayList<>(m.values());
    //    }
    //}
    //

}

//8
//ms
//击败
//36.59%
//复杂度分析
//消耗内存分布
//46.88
//MB
//击败
//59.33%