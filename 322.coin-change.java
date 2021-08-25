/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution {

    Integer[][] dp;

    int coinChange(int[] coins, int amount, int n) {

        if (n < 0 || amount <= 0)
            return (amount == 0) ? 0 : Integer.MAX_VALUE - 1;

        if (dp[n][amount] != null)
            return dp[n][amount];

        int includeCoin = coinChange(coins, amount - coins[n], n);
        int excludeCoin = coinChange(coins, amount, n - 1);

        dp[n][amount] = Math.min(excludeCoin, includeCoin + 1);
        return dp[n][amount];
    }

    public int coinChange(int[] coins, int amount) {

        dp = new Integer[coins.length][amount + 1];

        int used = coinChange(coins, amount, coins.length - 1);
        return (used > amount) ? -1 : used;
    }
}
// @lc code=end
