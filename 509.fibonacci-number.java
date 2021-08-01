/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {

        if (n == 0 || n == 1)
            return n;


        int fib0 = 0;
        int fib1 = 1;
        int fib2 = -1;


        for (int i = 2; i <= n; i++) {
            fib2 = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib2;
        }


        return fib2;
    }
}
// @lc code=end
