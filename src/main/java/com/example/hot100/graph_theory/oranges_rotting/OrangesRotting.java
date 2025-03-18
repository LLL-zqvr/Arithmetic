package com.example.hot100.graph_theory.oranges_rotting;

import java.util.ArrayList;
import java.util.List;
//994. 腐烂的橘子
//中等
//相关标签
//相关企业
//在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
//
//值 0 代表空单元格；
//值 1 代表新鲜橘子；
//值 2 代表腐烂的橘子。
//每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
//
//返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
//
// 示例 2：
//
//输入：grid = [[2,1,1],[0,1,1],[1,0,1]]
//输出：-1
//解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个方向上。
//示例 3：
//
//输入：grid = [[0,2]]
//输出：0
//解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
//m == grid.length
//n == grid[i].length
//1 <= m, n <= 10
//grid[i][j] 仅为 0、1 或 2
public class OrangesRotting {
    public static int orangesRotting(int[][] grid) {
        //思路：创建列表储存坏掉的橘子，然后遍历列表，将坏掉的橘子周围新鲜橘子的值改为坏掉的橘子的值。
        //储存好橘子的个数。
        // 然后继续遍历列表，如果没再有好橘子被转化退出循环。
        //根据好橘子个数返回答案。
        int fresh = 0;
        int result = 0;
        int flag = 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2) {
                    list.add(new int[]{i, j});
                }
            }
        }
        while (fresh != 0 && !list.isEmpty()) {
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] == 2) {
                        flag = 0;
                        if(j - 1 >= 0 && grid[i][j - 1] == 1) {
                            grid[i][j - 1] = 2;
                            list.add(new int[]{i, j - 1});
                            fresh--;
                            flag = 1;
                        }
                        if(j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                            grid[i][j + 1] = 2;
                            list.add(new int[]{i, j + 1});
                            fresh--;
                            flag = 1;
                        }
                        if(i - 1 >= 0 && grid[i - 1][j] == 1) {
                            grid[i - 1][j] = 2;
                            list.add(new int[]{i - 1, j});
                            fresh--;
                            flag = 1;
                        }
                        if(i + 1 < grid.length && grid[i + 1][j] == 1) {
                            grid[i + 1][j] = 2;
                            list.add(new int[]{i + 1, j});
                            fresh--;
                            flag = 1;
                        }
                        if (flag == 1) {
                            result++;
                        }
                    }

                }
            }
        }

        return fresh == 0 ? result : -1;
    }
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
}
