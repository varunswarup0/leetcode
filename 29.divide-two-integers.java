/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == 1 << 31 && divisor == -1)
            return (1 << 31) - 1;

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);

        int res = 0;
        int x = 0;

        while (a - b >= 0) {

            for (x = 0; a - (b << x << 1) >= 0; x++);

            res += (1 << x);
            a -= (b << x);
        }


        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}
// @lc code=end
