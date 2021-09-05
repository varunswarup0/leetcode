/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {

    public boolean isPowerOfTwo(int n) {

        if (n <= 0)
            return false;

        // Power of 2 means only one bit of n is '1'
        // First extract last set bit we do n bitwiseAND -n
        int lastSetBit = (n & -n);

        n -= lastSetBit;

        return n == 0;
    }
}
// @lc code=end
