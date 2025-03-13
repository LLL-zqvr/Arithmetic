package com.example.hot100.dp;

public class ClimbStairs {
    //使用了递归和记忆数组（像缓存哈哈哈哈）。
    //class Solution {
    //    public int climbStairs(int n) {
    //        int[] memo = new int[n + 1];
    //        Arrays.fill(memo , -1);
    //        return dfs(n,memo);
    //    }
    //    private int dfs(int i, int[] memo) {
    //        //记忆
    //        if(i <= 1 ){
    //            return 1;
    //        }
    //        if(memo[i] != -1){
    //            return memo[i];
    //        } else {
    //            return memo[i] = dfs(i - 1,memo) + dfs(i - 2,memo);
    //        }
    //    }
    //}
}
//执行用时分布
//0
//ms
//击败
//100.00%
//复杂度分析
//消耗内存分布
//39.52
//MB
//击败
//64.50%