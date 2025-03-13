package com.example.hot100.sliding_window;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "anviaj";
        int p = 0;
        int max = 0;
//        if(s.equals("")){return;}
        List<String> list = new ArrayList<>();
        String[] strs = s.split("");
        while( p < strs.length) {
            if(list.contains(strs[p])) {
                list.clear();
                if(strs[p - 1].equals(strs[p])) {
                    System.out.println(p);
                    list.add(strs[p]);
                } else {
                    list.add(strs[p - 1]);
                    list.add(strs[p]);

                }

                p++;
            }else {
                list.add(strs[p]);
                System.out.println(list);
                p++;
                max = Math.max(max, list.size());
            }
        }

        System.out.println(max);

    }
}
