package com.abdoa.leetcode;

public class P200_NumberOFIslands {

    static void main() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        if(grid== null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int result = 0;
        for(int i=0; i< grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if (grid[i][j] == '1') {
                    dfs(grid,i,j);
                    result++;
                }

            }
        }

        return result;

    }

    private static void dfs(char[][] grid, int i, int j) {
        if(i<0 || i >= grid.length || j<0 || j>=grid[i].length || grid[i][j]== '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

    }


}
