package com.example.hot100.sliding_window.find_anagrams;

public class FindAnagrams {
    //class Solution {
    //    public List<Integer> findAnagrams(String s, String p) {
    //        int sLen = s.length(), pLen = p.length();
    //
    //        if (sLen < pLen) {
    //            return new ArrayList<Integer>();
    //        }
    //
    //        List<Integer> ans = new ArrayList<Integer>();
    //        int[] sCount = new int[26];
    //        int[] pCount = new int[26];
    //        for (int i = 0; i < pLen; ++i) {
    //            ++sCount[s.charAt(i) - 'a'];
    //            ++pCount[p.charAt(i) - 'a'];
    //        }
    //
    //        if (Arrays.equals(sCount, pCount)) {
    //            ans.add(0);
    //        }
    //
    //        for (int i = 0; i < sLen - pLen; i++) {
    //            --sCount[s.charAt(i) - 'a'];
    //            ++sCount[s.charAt(i + pLen) - 'a'];
    //
    //            if (Arrays.equals(sCount, pCount)) {
    //                ans.add(i + 1);
    //            }
    //        }
    //
    //        return ans;
    //    }
    //}
    public static void main(String[] args) {
//        String s = "cbaebabacd";
//        String p = "abc";
//        String[] strS = s.split("");
//
//        System.out.println('t' - 'a');
//        System.out.println('b' - 'a');
    }
}
