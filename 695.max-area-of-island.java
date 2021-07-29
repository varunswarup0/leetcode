/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

// @lc code=start
class Solution {

    int dfs(int i, int j, int[][] grid) {

        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0)
            return 0;

        grid[i][j] = 0;

        int north = dfs(i + 1, j, grid);
        int south = dfs(i - 1, j, grid);
        int east = dfs(i, j + 1, grid);
        int west = dfs(i, j - 1, grid);

        return north + south + east + west + 1;
    }


    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] != 0) {
                    int area = dfs(i, j, grid);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}
// @lc code=end
