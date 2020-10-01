package com.github.alfreadx.solution;

public class Q200 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int numIslands(char[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1' && dfs(grid, i, j) >= 1) count++;
                }
            }
            return count;
        }


        private int dfs(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return 0;

            if (grid[i][j] == '1') {
                grid[i][j] = '0';
                return 1 + dfs(grid, i, j - 1)
                        + dfs(grid, i - 1, j)
                        + dfs(grid, i, j + 1)
                        + dfs(grid, i + 1, j);
            }

            return 0;
        }
    }

}