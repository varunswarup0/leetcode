/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {


    public int uniquePaths(int n, int m) {

        int[][] dp = new int[n][m];


        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                if (i == n - 1 && j == m - 1)
                    dp[i][j] = 1;

                else {
                    int down = (i == n - 1) ? 0 : dp[i + 1][j];
                    int right = (j == m - 1) ? 0 : dp[i][j + 1];

                    dp[i][j] = down + right;

                }
            }
        }

        return dp[0][0];
    }
}
// @lc code=end
