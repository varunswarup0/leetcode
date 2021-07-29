/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int lowestPoint = prices[0];
        int maxProft = 0;

        for (int i = 1; i < prices.length; i++) {
            if (lowestPoint >= prices[i])
                lowestPoint = prices[i];
            else
                maxProft = Math.max(maxProft, prices[i] - lowestPoint);
        }

        return maxProft;
    }
}
// @lc code=end
