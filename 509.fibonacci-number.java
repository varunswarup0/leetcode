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


        for (int i = 2; i <= n; i++) {
            int newFib1 = fib0 + fib1;
            int newFib0 = fib1;
            fib0 = newFib0;
            fib1 = newFib1;
        }


        return fib1;
    }
}
// @lc code=end
