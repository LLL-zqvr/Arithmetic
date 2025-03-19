package com.example.hot100.graph_theory.numIsLands;

import java.util.ArrayList;
import java.util.List;

public class numIsLands {
    //200. 岛屿数量
    //中等
    //相关标签
    //相关企业
    //给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
    //
    //岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
    //
    //此外，你可以假设该网格的四条边均被水包围。
    //
    //
    //
    //示例 1：
    //
    //输入：grid = [
    //  ["1","1","1","1","0"],
    //  ["1","1","0","1","0"],
    //  ["1","1","0","0","0"],
    //  ["0","0","0","0","0"]
    //]
    //输出：1
    //示例 2：
    //
    //输入：grid = [
    //  ["1","1","0","0","0"],
    //  ["1","1","0","0","0"],
    //  ["0","0","1","0","0"],
    //  ["0","0","0","1","1"]
    //]
    //输出：3
    //
    //
    //提示：
    //
    //m == grid.length
    //n == grid[i].length
    //1 <= m, n <= 300
    //grid[i][j] 的值为 '0' 或 '1'

    //思路：创建列表，遍历矩阵，将1加入列表，遍历列表及列表的四个方向。如果值为1，则将该值改为2，并加入列表。
    private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static int numIslands(char[][] grid) {

        int count = 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    list.add(new int[]{i, j});
                }
            }
        }
        List<int[]> q = list;
        while (!q.isEmpty()) {
            for(int[] land : list){
                for(int[] dir : dirs) {
                    int i = land[0] + dir[0];
                    int j = land[1] + dir[1];
                    if(i >= 0  && i < grid.length && j >= 0 && j < grid[i].length && grid[i][j] == '1'){
                        grid[i][j] = '2';
                        q.remove(grid[i][j]);
                    }
                }
            }
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        System.out.println(numIslands(grid));
    }
}
//错了