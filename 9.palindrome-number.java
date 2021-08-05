/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

        int orgX = x;
        int revX = 0;

        while (x > 0) {
            int remainder = x % 10;
            int quotient = x / 10;

            revX = revX * 10 + remainder;

            x = quotient;
        }



        return orgX == revX;
    }
}
// @lc code=end
