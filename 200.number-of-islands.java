/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {

    boolean sinkIsland(int i, int j, char[][] grid) {

        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == '0')
            return false;


        grid[i][j] = '0';

        sinkIsland(i + 1, j, grid);
        sinkIsland(i - 1, j, grid);
        sinkIsland(i, j + 1, grid);
        sinkIsland(i, j - 1, grid);

        return true;
    }

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                count += sinkIsland(i, j, grid) ? 1 : 0;

        return count;
    }
}
// @lc code=end
