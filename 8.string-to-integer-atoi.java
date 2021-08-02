/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {

        int res = 0;
        int curr = 0;
        boolean negative = false;

        if (s.charAt(curr) == '-') {
            negative = true;
            curr++;
        }

        while (curr < s.length()) {
            int num = s.charAt(curr) - 48;
            res += (res * 10) + num;
            curr++;
        }

        return (negative) ? -res : res;

    }
}
// @lc code=end
