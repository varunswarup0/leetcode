/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {

        if (n < 0)
            return (1 / x) * myPow((1 / x), -(n + 1));

        double res = 1;

        for (int i = 1; i <= n; i++)
            res *= x;

        return res;
    }
}
// @lc code=end
